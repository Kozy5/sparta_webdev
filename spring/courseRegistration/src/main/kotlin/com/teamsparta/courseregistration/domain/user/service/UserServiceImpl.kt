package com.teamsparta.courseregistration.domain.user.service

import com.teamsparta.courseregistration.domain.exception.ModelNotFoundException
import com.teamsparta.courseregistration.domain.user.dto.SignUpRequest
import com.teamsparta.courseregistration.domain.user.dto.UpdateUserProfileRequest
import com.teamsparta.courseregistration.domain.user.dto.UserResponse
import com.teamsparta.courseregistration.domain.user.model.Profile
import com.teamsparta.courseregistration.domain.user.model.User
import com.teamsparta.courseregistration.domain.user.model.UserRole
import com.teamsparta.courseregistration.domain.user.model.toResponse
import com.teamsparta.courseregistration.domain.user.repository.UserRepository
import jakarta.transaction.Transactional
import org.springframework.data.crossstore.ChangeSetPersister
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(
    private val userRepository: UserRepository,
):UserService {
    @Transactional
    override fun signUp(request: SignUpRequest): UserResponse {
        if(userRepository.existsByEmail(request.email)){
            throw IllegalStateException("Already exits email : ${request.email}")
        }
        return userRepository.save(
            User(
            email = request.email,
            password = request.password,
            profile = Profile(nickname = request.nickname),
            role = when(request.role){
                UserRole.STUDENT.name -> UserRole.STUDENT
                UserRole.TUTOR.name -> UserRole.TUTOR
                else -> throw IllegalStateException("Invalid rold : $request.role")
            }
        )
        ).toResponse()
    }
    @Transactional
    override fun updateUserProfile(userId: Long, request: UpdateUserProfileRequest): UserResponse {
        val user = userRepository.findByIdOrNull(userId) ?: throw ModelNotFoundException("user", userId)
        user.email = request.email
        user.profile = Profile(
            nickname = request.nickname,
        )
        return userRepository.save(user).toResponse()
    }

}