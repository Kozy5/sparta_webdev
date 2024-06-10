package com.teamsparta.courseregistration

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication
import org.springframework.context.annotation.EnableAspectJAutoProxy
import org.springframework.data.jpa.repository.config.EnableJpaAuditing
import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity


@EnableJpaAuditing
@EnableAspectJAutoProxy
@SpringBootApplication
class CourseRegistrationApplication

fun main(args: Array<String>) {
	runApplication<CourseRegistrationApplication>(*args)
}
