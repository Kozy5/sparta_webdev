package com.teamsparta.jwt1.common.exception

class InvalidInputException(
    val fieldName: String = "",
    message: String = "Invalid Input"
): RuntimeException(message)