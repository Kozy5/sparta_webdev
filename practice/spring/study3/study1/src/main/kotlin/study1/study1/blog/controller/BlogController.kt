package study1.study1.blog.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import study1.study1.blog.dto.BlogDto
import study1.study1.blog.service.BlogService

@RequestMapping("/api/blog")
@RestController
class BlogController(
    val blogService:BlogService
) {
    @GetMapping("")
    fun search(@RequestBody blogDto: BlogDto):String? {
        val result = blogService.searchKakao(blogDto)
        return result
    }
}

