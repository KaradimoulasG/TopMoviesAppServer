package com.example.routes

import com.example.repo.MoviesRepository
import io.ktor.http.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.searchMovies() {
    val moviesRepository: MoviesRepository by inject()

    get("/moviesApp/searchMovie") {
        val name = call.request.queryParameters["name"]

        val apiResponse = moviesRepository.searchMovies(name = name)
        call.respond(
            status = HttpStatusCode.OK,
            message = apiResponse
        )
    }
}