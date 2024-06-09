package com.teamsparta.courseregistration.domain.course.service

import com.teamsparta.courseregistration.domain.course.dto.CourseResponse
import com.teamsparta.courseregistration.domain.course.dto.CreateCourseRequest
import com.teamsparta.courseregistration.domain.course.dto.UpdateCourseRequest
import com.teamsparta.courseregistration.domain.course.model.Course
import com.teamsparta.courseregistration.domain.course.model.CourseStatus
import com.teamsparta.courseregistration.domain.course.model.toResponse
import com.teamsparta.courseregistration.domain.course.repository.CourseRepository
import com.teamsparta.courseregistration.domain.courseapplication.dto.ApplyCourseRequest
import com.teamsparta.courseregistration.domain.courseapplication.dto.CourseApplicationResponse
import com.teamsparta.courseregistration.domain.courseapplication.dto.UpdateApplicationStatusRequest
import com.teamsparta.courseregistration.domain.courseapplication.model.CourseApplication
import com.teamsparta.courseregistration.domain.courseapplication.model.CourseApplicationStatus
import com.teamsparta.courseregistration.domain.courseapplication.model.toResponse
import com.teamsparta.courseregistration.domain.courseapplication.repository.CourseApplicationRepository
import com.teamsparta.courseregistration.domain.exception.ModelNotFoundException
import com.teamsparta.courseregistration.domain.lecture.dto.AddLectureRequest
import com.teamsparta.courseregistration.domain.lecture.dto.LectureResponse
import com.teamsparta.courseregistration.domain.lecture.dto.UpdateLectureRequest
import com.teamsparta.courseregistration.domain.lecture.model.Lecture
import com.teamsparta.courseregistration.domain.lecture.model.toResponse
import com.teamsparta.courseregistration.domain.lecture.repository.LectureRepository
import com.teamsparta.courseregistration.domain.user.repository.UserRepository
import com.teamsparta.courseregistration.infra.aop.StopWatch
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class CourseServiceImpl(
    private val courseRepository: CourseRepository,
    private val lectureRepository: LectureRepository,
    private val userRepository: UserRepository,
    private val courseApplicationRepository: CourseApplicationRepository
):CourseService {


    override fun getAllCourseList(): List<CourseResponse> {
        return courseRepository.findAll().map {it.toResponse()}
    }

    @StopWatch
    override fun getCourseById(courseId: Long): CourseResponse {
        val course = courseRepository.findByIdOrNull(courseId) ?: throw ModelNotFoundException("course",courseId)
        return course.toResponse()
    }

    @Transactional
    override fun createCourse(request: CreateCourseRequest): CourseResponse {
        val course = Course(
            title = request.title,
            description = request.description
        )
        return courseRepository.save(course).toResponse()
    }

    @Transactional
    override fun updateCourse(courseId: Long, request: UpdateCourseRequest): CourseResponse {
        val course = courseRepository.findByIdOrNull(courseId) ?: throw ModelNotFoundException("course",courseId)
        course.title = request.title
        course.description = request.description
        return courseRepository.save(course).toResponse()
    }

    @Transactional
    override fun deleteCourse(courseId: Long) {
        val course = courseRepository.findByIdOrNull(courseId) ?: throw ModelNotFoundException("course",courseId)
        courseRepository.delete(course)
    }

    override fun getLectureList(courseId: Long): List<LectureResponse> {
        val course = courseRepository.findByIdOrNull(courseId) ?: throw ModelNotFoundException("course",courseId)
        return course.lectures.map{it.toResponse()}
    }

    override fun getLecture(courseId: Long, lectureId: Long): LectureResponse {
        val lecture = lectureRepository.findByCourseIdAndId(courseId, lectureId) ?: throw ModelNotFoundException("lecture",lectureId)
        return lecture.toResponse()
    }

    @Transactional
    override fun addLecture(courseId: Long, request: AddLectureRequest): LectureResponse {
        val course = courseRepository.findByIdOrNull(courseId) ?: throw ModelNotFoundException("course", courseId)
        val lecture = Lecture(
            title = request.title,
            videoUrl = request.videoUrl,
            course = course
        )
        return lectureRepository.save(lecture).toResponse()
    }

    @Transactional
    override fun updateLecture(courseId: Long, lectureId: Long, request: UpdateLectureRequest): LectureResponse {
        val lecture = lectureRepository.findByCourseIdAndId(courseId,lectureId) ?: throw ModelNotFoundException("lecture",lectureId)
        lecture.title = request.title
        lecture.videoUrl = request.videoUrl
        return lectureRepository.save(lecture).toResponse()
    }

    @Transactional
    override fun removeLecture(courseId: Long, lectureId: Long) {
        val course = courseRepository.findByIdOrNull(courseId) ?: throw ModelNotFoundException("course",courseId)
        val lecture = lectureRepository.findByCourseIdAndId(courseId,lectureId) ?: throw ModelNotFoundException("lecture",lectureId)
        course.lectures.remove(lecture)
        courseRepository.save(course)
    }

    @Transactional
    override fun applyCourse(courseId: Long, request: ApplyCourseRequest): CourseApplicationResponse {
        val course = courseRepository.findByIdOrNull(courseId) ?: throw ModelNotFoundException("course",courseId)
        val user = userRepository.findByIdOrNull(request.userId) ?: throw ModelNotFoundException("user",request.userId)

        if(course.status == CourseStatus.CLOSED){
            throw IllegalStateException("Course is already closed. courseId: $courseId")
        }else if(courseApplicationRepository.existsByCourseIdAndUserId(courseId, request.userId)){
            throw IllegalStateException("Already applied. courseId: $courseId, userId: $request.userId")
        }

        val courseApplication = CourseApplication(
            course = course,
            user = user
        )

        return courseApplicationRepository.save(courseApplication).toResponse()
    }

    override fun getCourseApplication(courseId: Long, applicationId: Long): CourseApplicationResponse {
        val courseApplication = courseApplicationRepository.findByCourseIdAndId(courseId, applicationId) ?: throw ModelNotFoundException("courseApplication",applicationId)
        return courseApplication.toResponse()
    }

    override fun getCourseApplicationList(courseId: Long): List<CourseApplicationResponse> {
        val course = courseRepository.findByIdOrNull(courseId) ?: throw ModelNotFoundException("course", courseId)
        return course.courseApplications.map{it.toResponse()}
    }

    @Transactional
    override fun updateCourseApplicationStatus(
        courseId: Long,
        applicationId: Long,
        request: UpdateApplicationStatusRequest
    ): CourseApplicationResponse {
        val course = courseRepository.findByIdOrNull(courseId) ?: throw ModelNotFoundException("course",courseId)
        val courseApplication = courseApplicationRepository.findByCourseIdAndId(courseId, applicationId) ?: throw ModelNotFoundException("courseApplication",applicationId)
        // 이미 처리 완료된 건인지 체크
        if(courseApplication.status != CourseApplicationStatus.PENDING){
            throw IllegalStateException("Already Completed CourseId : $courseId ApplicationId : $applicationId")
        }else if(course.status == CourseStatus.CLOSED){
            throw IllegalStateException("Already Closed Course CourseId : $courseId")
        }
        // 승인 / 거절에 따른 처리
        if(request.status == CourseApplicationStatus.ACCEPTED.name){
            courseApplication.status = CourseApplicationStatus.ACCEPTED
            course.numApplication+=1
            if(course.numApplication >= course.maxApplication){
                course.status = CourseStatus.CLOSED
            }
            courseRepository.save(course)
        }else if(request.status == CourseApplicationStatus.REJECTED.name){
            courseApplication.status = CourseApplicationStatus.REJECTED
        }else{
            throw IllegalArgumentException("Invalid status : ${request.status}")
        }

        return courseApplicationRepository.save(courseApplication).toResponse()

    }

}
