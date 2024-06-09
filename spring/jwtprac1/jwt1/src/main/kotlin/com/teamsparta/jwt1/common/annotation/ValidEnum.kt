package com.teamsparta.jwt1.common.annotation

import jakarta.validation.Constraint
import jakarta.validation.ConstraintValidator
import jakarta.validation.ConstraintValidatorContext
import jakarta.validation.Payload
import kotlin.reflect.KClass
@Target(AnnotationTarget.CLASS, AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
@Constraint(validatedBy = [ValidEnumValidator::class])
annotation class ValidEnum(
    val message: String = "Invalid enum value",
    val groups: Array<KClass<*>> = [],
    val payload: Array<KClass<out Payload>> = [],
    val enumClass: KClass<out Enum<*>>
)

class ValidEnumValidator: ConstraintValidator<ValidEnum, String>{
    private lateinit var enumValues: Array<out Enum<*>>
    override fun initialize(annotation: ValidEnum){
        enumValues = annotation.enumClass.java.enumConstants
    }

    override fun isValid(value: String?, p1: ConstraintValidatorContext?): Boolean {
        if(value == null){
            return true
        }
        return enumValues.any {it.name == value.toString()}
    }
}