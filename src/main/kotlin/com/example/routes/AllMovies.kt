package com.example.routes

import com.example.common.Constants
import com.example.models.ApiResponse
import com.example.repo.MoviesRepository
import io.ktor.http.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.getAllMovies(repo: MoviesRepository) {


    get("/moviesApp/allMovies") {
        try {
            val page = call.request.queryParameters["page"]?.toInt() ?: 1
            println("New page : $page")
            require(page in 1..5)

            val moviesList = repo.getAllMovies(page = page)
            call.respond(
                status = HttpStatusCode.OK,
                message = moviesList
            )
        } catch (e : NumberFormatException) {
            call.respond(
                status = HttpStatusCode.BadRequest,
                message = ApiResponse<Unit>(
                    success = false,
                    message = Constants.NUMBERS_ONLY_EXCEPTION,
                    data = null
                )
            )
        } catch (e : IllegalArgumentException) {
            call.respond(
                status = HttpStatusCode.NotFound,
                message = ApiResponse<Unit>(
                    success = false,
                    message = Constants.MOVIES_NOT_FOUND_EXCEPTION,
                    data = null
                )
            )
        }
    }

}