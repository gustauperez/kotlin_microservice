package com.gusi.kotlin.service

import com.gusi.kotlin.entities.Hello
import org.springframework.stereotype.Service

@Service
public class GreetingService {
    fun getHello(new_hello: String): Hello {
        return Hello(new_hello)
    }
}