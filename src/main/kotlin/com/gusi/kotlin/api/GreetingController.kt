package com.gusi.kotlin.api

import com.gusi.kotlin.entities.Hello
import com.gusi.kotlin.service.GreetingService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingController {

    @Autowired
    lateinit var greetingService: GreetingService

    @GetMapping("/hello")
    fun greeting(@RequestParam(value = "name", defaultValue = "Mars") name: String): Hello {
        return  greetingService.getHello(name)
    }
}