package com.example.kotlinbootgradle

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinBootGradleApplication

fun main(args: Array<String>) {
    runApplication<KotlinBootGradleApplication>(*args)
}
