package com.teamsparta.courseregistration.domain.user.controller

import com.teamsparta.courseregistration.domain.user.dto.CreateAccountRequest
import com.teamsparta.courseregistration.domain.user.dto.UpdateProfileRequst
import com.teamsparta.courseregistration.domain.user.dto.UserResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
class UserController {
    @PostMapping("/signup")
    fun signup(@RequestBody createAccountRequest: CreateAccountRequest): ResponseEntity<UserResponse>{
        TODO()
    }
    @PostMapping("/login")
    fun loginAccount(@RequestBody userResponse:UserResponse):ResponseEntity<UserResponse>{
        TODO()
    }
    @PutMapping("/users/{userId}/profile")
    fun updateProfile(@PathVariable userId:Long,@RequestBody updateProfileREqust: UpdateProfileRequst):ResponseEntity<UserResponse>{
        TODO()
    }
    @PostMapping("/logout")
    fun logout(@RequestBody userResponse:UserResponse):ResponseEntity<UserResponse>{
        TODO()
    }
}