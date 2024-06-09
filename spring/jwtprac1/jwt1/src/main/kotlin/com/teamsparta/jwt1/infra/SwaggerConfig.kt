package com.teamsparta.jwt1.infra

import io.swagger.v3.oas.models.Components
import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer




@Configuration
class SwaggerConfig: WebMvcConfigurer {
    @Bean
    fun openAPI():OpenAPI = OpenAPI()
        .components(Components())
        .info(
            Info()
                .title("JWT1")
                .description("JWT DESC")
                .version("1.0.0")
        )


}