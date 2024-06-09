package com.teamsparta.jwt1.common.dto

import com.teamsparta.jwt1.common.status.ResultCode

data class BaseResponse<T>(
    val result: String = ResultCode.SUCCESS.name,
    val data: T? = null,
    val message: String = ResultCode.SUCCESS.msg
)
