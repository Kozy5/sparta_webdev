package com.teamsparta.jwt1.common.service

import com.teamsparta.jwt1.common.dto.CustomUser
import com.teamsparta.jwt1.member.entity.Member
import com.teamsparta.jwt1.member.repository.MemberRepository
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service

@Service
class CustomUserDetailsService(
    private val memberRepository: MemberRepository,
    private val passwordEncoder: PasswordEncoder,
) : UserDetailsService {
    override fun loadUserByUsername(username: String): UserDetails =
        memberRepository.findByLoginId(username)
            ?.let { createUserDetails(it) }
            ?: throw UsernameNotFoundException("해당하는 유저를 찾을 수 없습니다.")

    private fun createUserDetails(member: Member): UserDetails =
        CustomUser(
            member.id!!,
            member.loginId,
            passwordEncoder.encode(member.password),
            member.memberRole!!.map { SimpleGrantedAuthority("ROLE_${it.role}") }
        )
}

