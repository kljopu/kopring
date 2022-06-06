package com.kotlinspring.contentservice.contoller

import com.kotlinspring.contentservice.service.HelloService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/hello")
class StartAppController(val helloService: HelloService) {
    @GetMapping("/{name}")
    fun retrieveHello(@PathVariable("name") name: String): String {

        return helloService.retrieveHello(name)
    }
}