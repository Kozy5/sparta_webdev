package com.teamsparta.courseregistration.domain.courseapplication.dto

import com.teamsparta.courseregistration.domain.courseapplication.model.CourseApplicationStatus

data class UpdateApplicationStatusRequest(
    val status: String
)
