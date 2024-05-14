package com.teamsparta.courseregistration.domain.user.model

import com.teamsparta.courseregistration.domain.courseapplication.model.CourseApplication
import jakarta.persistence.*

@Entity
@Table(name = "app_user")
class User(
    @Column(name = "email")
    val email: String,

    @Column(name = "password")
    val password: String,

    @Embedded
    var profile:Profile,

    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    var role:UserRole,

    @OneToMany(mappedBy = "user", cascade = [CascadeType.ALL], orphanRemoval = true)
    val courseApplication:MutableList<CourseApplication> = mutableListOf(),
){
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
}