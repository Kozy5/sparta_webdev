package com.teamsparta.courseregistration.domain.lecture.controller

import com.teamsparta.courseregistration.domain.lecture.dto.CreateLectureRequest
import com.teamsparta.courseregistration.domain.lecture.dto.LectureResponse
import com.teamsparta.courseregistration.domain.lecture.dto.UpdateLectureRequest
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RequestMapping("/courses/{coursesId}/lectures")
@RestController
class LectureController {

    @GetMapping
    fun getLectureList(@RequestBody lectureResponse:LectureResponse): ResponseEntity<LectureResponse>{
        TODO()
    }
    @GetMapping("/{lecturesId}")
    fun getLecture(@PathVariable lectureId:Long,@RequestBody lectureResponse:LectureResponse):ResponseEntity<LectureResponse>{
        TODO()
    }
    @PostMapping
    fun createLecture(@RequestBody createLectureRequest: CreateLectureRequest):ResponseEntity<LectureResponse>{
        TODO()
    }
    @PutMapping("/{lectureId}")
    fun updateLecture(@PathVariable lectureId:Long,@RequestBody updateLectureRequest: UpdateLectureRequest):ResponseEntity<LectureResponse>{
        TODO()
    }
    @DeleteMapping("/{lectureId}")
    fun deleteLecture(@PathVariable lectureId:Long,@RequestBody lectureResponse:LectureResponse):ResponseEntity<LectureResponse>{
        TODO()
    }
}