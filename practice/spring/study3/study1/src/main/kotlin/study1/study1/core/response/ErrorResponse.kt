package study1.study1.core.response

data class ErrorResponse(
    val message: String,
    val errorType: String = "Invalid Argument"
)