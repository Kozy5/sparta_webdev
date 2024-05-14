package com.teamsparta.courseregistration.domain.course.model

import com.teamsparta.courseregistration.domain.courseapplication.model.CourseApplication
import com.teamsparta.courseregistration.domain.lecture.model.Lecture
import jakarta.persistence.*

@Entity
@Table(name = "course")
class Course(
    @Column(name = "title")
    var title: String,

    @Column(name = "description")
    var description: String? =null,

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    var status: CourseStatus,

    @Column(name = "max_application")
    var maxApplication: Int = 30,

    @Column(name = "min_application")
    var minApplication: Int = 0,

    @OneToMany(mappedBy = "course", fetch = FetchType.LAZY, cascade = [CascadeType.ALL], orphanRemoval = true)
    var lectures: MutableList<Lecture> = mutableListOf(),

    @OneToMany(mappedBy = "course", fetch = FetchType.LAZY, cascade = [CascadeType.ALL], orphanRemoval = true)
    var courseAppilcation: MutableList<CourseApplication> = mutableListOf()

){

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
}