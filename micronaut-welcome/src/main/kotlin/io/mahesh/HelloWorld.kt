package io.mahesh

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonTypeInfo
import io.micronaut.core.annotation.Introspected
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post
import org.slf4j.Logger
import org.slf4j.LoggerFactory


@Controller("/welcome")
class HelloWorld {

    var lst = mutableListOf<Country>(Country("US",100), Country("SL",200))
    private val logger: Logger = LoggerFactory.getLogger(javaClass)

    @Get("/hello")
    fun index(): String? {
        return "Hello World"
    }

    @Post("/create")
    fun create(@Body country: Country): List<Country> {
        logger.info("{}",country);
        lst.add(country)
      return  lst
    }
}
@Introspected
data class Country(
    val name: String,
    val postiveCases: Int
    )