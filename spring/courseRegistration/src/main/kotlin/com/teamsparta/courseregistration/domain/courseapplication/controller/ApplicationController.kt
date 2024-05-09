package com.teamsparta.courseregistration.domain.courseapplication.controller

import com.teamsparta.courseregistration.domain.courseapplication.dto.ApplicationResponse
import com.teamsparta.courseregistration.domain.courseapplication.dto.ApplyLecture
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RequestMapping("/courses/{courseId}/applications")
@RestController
class ApplicationController {

    @PostMapping
    fun applyLecture(@RequestBody applyLecture: ApplyLecture):ResponseEntity<ApplicationResponse>{
        TODO()
    }
    @GetMapping
    fun getApplicationList(@RequestBody applicationResponse: ApplicationResponse): ResponseEntity<ApplicationResponse>{
        TODO()
    }
    @GetMapping("/{applicationsId}")
    fun getApplication(@PathVariable applicationsId:Long,@RequestBody applicationResponse:ApplicationResponse):ResponseEntity<ApplicationResponse>{
        TODO()
    }
    @PatchMapping("/{applicationsId}")
    fun updateApplication(@PathVariable applicationsId:Long,@RequestBody applicationResponse:ApplicationResponse):ResponseEntity<ApplicationResponse>{
        TODO()
    }

}