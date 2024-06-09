package com.teamsparta.jwt1

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.autoconfigure.domain.EntityScan

@SpringBootApplication
@EntityScan(basePackages = ["com.teamsparta.jwt1.member.entity"])
class Jwt1Application

fun main(args: Array<String>) {
	runApplication<Jwt1Application>(*args)
}