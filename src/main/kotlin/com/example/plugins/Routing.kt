package com.example.plugins

import com.example.routes.getAllMovies
import com.example.routes.root
import com.example.routes.searchMovies
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        root()
        getAllMovies()
        searchMovies()

        staticResources(remotePath = "/images", basePackage = "images")
    }
}
