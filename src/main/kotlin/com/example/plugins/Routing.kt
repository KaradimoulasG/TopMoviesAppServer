package com.example.plugins

import com.example.routes.root
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.plugins.statuspages.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Hello World!")
        }

        root()

        // add staticResources(remotePath = "/images", basePackage = "images")
    }
}
