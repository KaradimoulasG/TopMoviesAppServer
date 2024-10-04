package com.example.repo

import com.example.common.Constants.NEXT_PAGE_KEY
import com.example.common.Constants.PREVIOUS_PAGE_KEY
import com.example.models.ApiResponse
import com.example.models.Movie

class MoviesRepositoryImpl : MoviesRepository {

    override val movies: Map<Int, List<Movie>> by lazy {
        mapOf(
            1 to page1,
            2 to page2,
            3 to page3,
            4 to page4,
            5 to page5
        )
    }


    override val page1: List<Movie>
        get() = TODO("Not yet implemented")
    override val page2: List<Movie>
        get() = TODO("Not yet implemented")
    override val page3: List<Movie>
        get() = TODO("Not yet implemented")
    override val page4: List<Movie>
        get() = TODO("Not yet implemented")
    override val page5: List<Movie>
        get() = TODO("Not yet implemented")

    override suspend fun getAllMovies(page: Int) =
        ApiResponse(
            success = true,
            message = "ok",
            previousPage = calculatePage(page = page)[PREVIOUS_PAGE_KEY],
            nextPage = calculatePage(page = page)[NEXT_PAGE_KEY],
            movies = movies[page] ?: listOf(),
            lastUpdated = System.currentTimeMillis()
        )

    override suspend fun searchMovies(name: String?) =
        ApiResponse(
            success = true,
            message = "ok",
            movies = findMovies(query = name)
        )

    private fun calculatePage(page: Int): Map<String, Int?> {
        var previousPage: Int? = page
        var nextPage: Int? = page

        if (page in 1..4) nextPage = nextPage?.plus(1)
        if (page in 2..5) previousPage = previousPage?.minus(1)

        if (page == 1) previousPage = null
        if (page == 5) nextPage = null

        return mapOf(PREVIOUS_PAGE_KEY to previousPage, NEXT_PAGE_KEY to nextPage)
    }

    private fun findMovies(query: String?): List<Movie> {
        val movieFound = mutableListOf<Movie>()

        return if (!query.isNullOrEmpty()) {
            movies.forEach { (_, movies) ->
                movies.forEach { movie ->
                    if (movie.name.lowercase().contains(query.lowercase())) movieFound.add(movie)
                }
            }
            movieFound
        } else emptyList()
    }
}