package com.example.application

import com.example.plugins.*
import io.ktor.server.application.*

@Suppress("unused")
fun Application.module() {
    configureSerialization()
    configureKoin()
    configureRouting()
    configureMonitoring()
    configureHTTP()
    configureStatusPages()
}