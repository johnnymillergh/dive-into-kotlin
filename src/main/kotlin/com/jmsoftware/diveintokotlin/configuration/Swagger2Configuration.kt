package com.jmsoftware.diveintokotlin.configuration

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.service.ApiInfo
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2

/**
 * Swagger 2 configuration.
 *
 * @see <a href="http://localhost:8080/doc.html?lang=en&cache=1">Click me to view API documentation page</a>
 * @author Johnny Miller (锺俊), email: johnnysviva@outlook.com
 * @date 10/25/19 1:30 PM
 **/
@Configuration
@EnableSwagger2
@Suppress("GraziInspection")
class Swagger2Configuration {
    @Bean
    fun createRestApi(): Docket {
        return Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
    }

    private fun apiInfo(): ApiInfo {
        return ApiInfoBuilder()
                .title("API Documentation for Dive into Kotlin")
                .description("A Kotlin learning project.")
                .build()
    }
}
