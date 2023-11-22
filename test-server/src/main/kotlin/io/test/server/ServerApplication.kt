package io.test.server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@SpringBootApplication
@EnableScheduling
open class TestApplication : WebMvcConfigurer {}

fun main(args: Array<String>) {
    runApplication<TestApplication>(*args)
}