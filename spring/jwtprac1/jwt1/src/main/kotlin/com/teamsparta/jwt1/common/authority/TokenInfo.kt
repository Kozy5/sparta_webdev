package com.teamsparta.jwt1.common.authority

data class TokenInfo(
    val grantType: String,
    val accessToken: String
)
