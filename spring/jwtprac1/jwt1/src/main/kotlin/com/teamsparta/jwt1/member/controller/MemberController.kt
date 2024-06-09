package com.teamsparta.jwt1.member.controller

import com.teamsparta.jwt1.common.authority.TokenInfo
import com.teamsparta.jwt1.common.dto.BaseResponse
import com.teamsparta.jwt1.common.dto.CustomUser
import com.teamsparta.jwt1.member.dto.LoginDto
import com.teamsparta.jwt1.member.dto.MemberDtoRequest
import com.teamsparta.jwt1.member.dto.MemberDtoResponse
import com.teamsparta.jwt1.member.service.MemberService
import jakarta.validation.Valid
import org.slf4j.LoggerFactory
import org.springframework.data.jpa.domain.AbstractPersistable_.id
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.web.bind.annotation.*

@RequestMapping("/member")
@RestController
class MemberController(
    private val memberService: MemberService
) {
    // 회원가입

    @PostMapping("/signup")
    fun signUp(@RequestBody @Valid memberDtoRequest: MemberDtoRequest): BaseResponse<Unit> {
        val resultMsg: String = memberService.signUp(memberDtoRequest)
        return BaseResponse(message = resultMsg)
    }

    // 로그인

    @PostMapping("/login")
    fun login(@RequestBody @Valid loginDto:LoginDto):BaseResponse<TokenInfo>{
        val tokenInfo = memberService.login(loginDto)
        return BaseResponse(data = tokenInfo)
    }

    // 내 정보 보기
    @GetMapping("/info")
    fun searchMyInfo(): BaseResponse<MemberDtoResponse> {
        val userId = (SecurityContextHolder.getContext().authentication.principal as CustomUser).userId
        val response = memberService.searchMyInfo(userId)
        return BaseResponse(data = response)
    }

    // 내 정보 수정
    @PutMapping("/info")
    fun updateMyInfo(@RequestBody @Valid memberDtoRequest: MemberDtoRequest):BaseResponse<Unit> {
        val userId = (SecurityContextHolder.getContext().authentication.principal as CustomUser).userId
        memberDtoRequest.id = userId
        val resultMsg: String = memberService.updateMyInfo(memberDtoRequest)
        return BaseResponse(message = resultMsg)
    }
}