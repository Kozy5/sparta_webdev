package study1.study1.core.exception

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import study1.study1.core.response.ErrorResponse

@RestControllerAdvice
class CustomExceptionHandler {

    @ExceptionHandler(InvaildInputException::class)
    protected fun invaildInputException(ex: InvaildInputException): ResponseEntity<ErrorResponse> {
        val errors = ErrorResponse(ex.message ?: "Not Exception Message")
        return ResponseEntity(errors, HttpStatus.BAD_REQUEST)
    }
}