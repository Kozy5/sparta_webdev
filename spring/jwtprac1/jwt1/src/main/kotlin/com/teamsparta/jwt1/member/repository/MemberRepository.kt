package com.teamsparta.jwt1.member.repository

import com.teamsparta.jwt1.member.entity.Member
import com.teamsparta.jwt1.member.entity.MemberRole
import org.springframework.data.jpa.repository.JpaRepository

interface MemberRepository : JpaRepository<Member, Long> {
    fun findByLoginId(loginId: String): Member?
}

interface MemberRoleRepository : JpaRepository<MemberRole, Long>
