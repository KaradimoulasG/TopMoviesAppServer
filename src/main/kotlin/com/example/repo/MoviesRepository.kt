package com.example.repo

import com.example.models.ApiResponse
import com.example.models.Movie

interface MoviesRepository {

    val movies: Map<Int, List<Movie>>

    val page1: List<Movie>
    val page2: List<Movie>
    val page3: List<Movie>
    val page4: List<Movie>
    val page5: List<Movie>

    suspend fun getAllMovies(page: Int = 1): ApiResponse<List<Movie>>
    suspend fun searchMovies(name: String?): ApiResponse<List<Movie>>
}