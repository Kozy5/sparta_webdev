package com.teamsparta.courseregistration.infra.security.jwt

import org.springframework.security.authentication.AbstractAuthenticationToken

class JwtAuthenticationToken(
    private val principal: UserPrincipal
):AbstractAuthenticationToken(principal.authorities) {
}