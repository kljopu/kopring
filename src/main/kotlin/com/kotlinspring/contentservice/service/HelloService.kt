package com.kotlinspring.contentservice.service

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service

@Service
class HelloService {

    @Value("\${message}")
    lateinit var message: String

    fun retrieveHello(name: String): String {
        return "Hello $name, $message"
    }
}