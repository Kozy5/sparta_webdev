package com.teamsparta.courseregistration.domain.courseapplication.controller

import com.teamsparta.courseregistration.domain.courseapplication.dto.CourseApplicationResponse
import com.teamsparta.courseregistration.domain.courseapplication.dto.ApplyCourseRequest
import com.teamsparta.courseregistration.domain.courseapplication.dto.UpdateApplicationStatusRequest
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RequestMapping("/courses/{courseId}/applications")
@RestController
class ApplicationController {

    @GetMapping
    fun getApplicationList(@PathVariable courseId:Long): ResponseEntity<List<CourseApplicationResponse>>{
        TODO()
    }
    @GetMapping("/{applicationsId}")
    fun getApplication(@PathVariable courseId:Long,@PathVariable applicationsId:Long):ResponseEntity<CourseApplicationResponse>{
        TODO()
    }

    @PostMapping
    fun applyCourse(@PathVariable courseId:Long, @RequestBody applyCourseRequest: ApplyCourseRequest):ResponseEntity<List<CourseApplicationResponse>>{

        TODO()
    }


    @PatchMapping("/{applicationsId}")
    fun updateApplicationStatus(@PathVariable courseId:Long,@PathVariable applicationsId:Long,@RequestBody updateApplicationStatusRequest: UpdateApplicationStatusRequest):ResponseEntity<CourseApplicationResponse>{
        TODO()
    }

}