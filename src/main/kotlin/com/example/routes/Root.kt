package com.example.routes

import io.ktor.http.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.root() {
    get("/") {
        call.respond(
            status = HttpStatusCode.OK,
            message= "Welcome to TopMoviesApp"
        )
    }
}