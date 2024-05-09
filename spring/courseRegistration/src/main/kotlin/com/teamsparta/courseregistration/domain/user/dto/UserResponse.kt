package com.teamsparta.courseregistration.domain.user.dto

data class UserResponse(
    val id:Long,
    val email:String,
    val password:String,
    val nickname:String,
    val type:String
)
