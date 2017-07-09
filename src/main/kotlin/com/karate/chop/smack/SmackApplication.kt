package com.karate.chop.smack

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class SmackApplication

fun main(args: Array<String>) {
    SpringApplication.run(SmackApplication::class.java, *args)
}
