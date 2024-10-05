package com.example.routes

import com.example.common.Constants
import com.example.models.ApiResponse
import com.example.repo.MoviesRepository
import io.ktor.http.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.getAllMovies() {
    val moviesRepository: MoviesRepository by inject()


    get("/moviesApp/allMovies") {
        try {
            val page = call.request.queryParameters["page"]?.toInt() ?: 1
            println("New page : $page")
            require(page in 1..5)

            val apiResponse = moviesRepository.getAllMovies(page = page)
            call.respond(
                status = HttpStatusCode.OK,
                message = apiResponse
            )
        } catch (e : NumberFormatException) {
            call.respond(
                status = HttpStatusCode.BadRequest,
                message = ApiResponse(success = false, message = Constants.NUMBERS_ONLY_EXCEPTION)
            )
        } catch (e : IllegalArgumentException) {
            call.respond(
                status = HttpStatusCode.NotFound,
                message = ApiResponse(success = false, message = Constants.MOVIES_NOT_FOUND_EXCEPTION)
            )
        }
    }

}