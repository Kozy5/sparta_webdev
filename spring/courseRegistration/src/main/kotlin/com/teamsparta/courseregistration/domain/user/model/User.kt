package com.teamsparta.courseregistration.domain.user.model

import com.teamsparta.courseregistration.domain.courseapplication.model.CourseApplication
import com.teamsparta.courseregistration.domain.user.dto.UserResponse
import jakarta.persistence.*

@Entity
@Table(name = "app_user")
class User(
    @Column(name = "email", nullable = false)
    var email: String,

    @Column(name = "password", nullable = false)
    val password: String,

    @Embedded
    var profile:Profile,

    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false)
    var role:UserRole,

    @OneToMany(mappedBy = "user", cascade = [CascadeType.ALL], orphanRemoval = true)
    val courseApplication:MutableList<CourseApplication> = mutableListOf(),
){
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
}
fun User.toResponse(): UserResponse {
    return UserResponse(
        id = id!!,
        nickname = profile.nickname,
        email = email,
        role = role.name
    )
}