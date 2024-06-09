package com.teamsparta.courseregistration.domain.courseapplication.model

import com.teamsparta.courseregistration.domain.course.model.Course
import com.teamsparta.courseregistration.domain.course.model.toResponse
import com.teamsparta.courseregistration.domain.courseapplication.dto.CourseApplicationResponse
import com.teamsparta.courseregistration.domain.user.model.User
import com.teamsparta.courseregistration.domain.user.model.toResponse
import jakarta.persistence.*

@Entity
@Table(name = "course_application")
class CourseApplication(

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    var status:CourseApplicationStatus = CourseApplicationStatus.PENDING,

    @ManyToOne
    @JoinColumn(name = "course_id")
    var course:Course,

    @ManyToOne
    @JoinColumn(name = "user_id")
    var user:User


){
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id:Long? = null
}
fun CourseApplication.toResponse(): CourseApplicationResponse {
    return CourseApplicationResponse(
        id = id!!,
        course = course.toResponse(),
        user = user.toResponse(),
        status = status.name
    )
}