package com.teamsparta.courseregistration.domain.course.service

import com.teamsparta.courseregistration.domain.course.dto.CourseResponse
import com.teamsparta.courseregistration.domain.course.dto.CreateCourseRequest
import com.teamsparta.courseregistration.domain.course.dto.UpdateCourseRequest
import org.springframework.stereotype.Service

@Service
class CourseServiceImpl:CourseService {
    override fun getAllCourseList(): List<CourseResponse> {
     // TODO : DB에서 모든 Course 목록 조회하여  CourseResponse로 변환 후 반환
        TODO("Not yet implemented")
    }

    override fun getCourseById(courseId: Long): CourseResponse {
     // TODO : DB에서 하나의 ID에 대응되는 목록 조회하여 CourseResponse로 변환 후 반환
        TODO("Not yet implemented")
    }

    override fun createCourse(request: CreateCourseRequest): CourseResponse {
     // TODO :새로운 코스 DB에 저장
        TODO("Not yet implemented")
    }

    override fun updateCourse(courseId: Long, request: UpdateCourseRequest): CourseResponse {
     // TODO : DB에서 courseId에해당 하는 코스를 가져와서 request기반으로 변경 내용 DB에 업데이트 후 저장하고, CourseResponse로 변환 후 반환

        TODO("Not yet implemented")
    }

    override fun deleteCourse(courseId: Long) {
     // TODO : DB에서 courseId에 해당 하는 코스를 DB에서 삭제
        TODO("Not yet implemented")
    }
}