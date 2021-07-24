package io.mahesh

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import org.slf4j.Logger
import org.slf4j.LoggerFactory


@Controller("/welcome")
class HelloWorld {

    private val logger: Logger = LoggerFactory.getLogger(javaClass)

    @Get("/hello")
    fun index(): String? {
        return "Hello World"
    }
}