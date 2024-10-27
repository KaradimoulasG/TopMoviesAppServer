package com.example.plugins

import com.example.repo.MoviesRepository
import com.example.routes.getAllMovies
import com.example.routes.root
import com.example.routes.searchMovies
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Application.configureRouting() {
    routing {
        val moviesRepository: MoviesRepository by inject()

        root()
        getAllMovies(repo = moviesRepository)
        searchMovies(repo = moviesRepository)

        staticResources(remotePath = "/images", basePackage = "images")
    }
}
