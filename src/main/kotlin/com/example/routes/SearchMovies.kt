package com.example.routes

import com.example.repo.MoviesRepository
import io.ktor.http.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.searchMovies(repo: MoviesRepository) {

    get("/moviesApp/searchMovie") {
        val name = call.request.queryParameters["name"]

        val moviesList = repo.searchMovies(name = name)
        call.respond(
            status = HttpStatusCode.OK,
            message = moviesList
        )
    }
}