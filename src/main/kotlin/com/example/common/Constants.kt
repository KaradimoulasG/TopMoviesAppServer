package com.example.common

import com.example.models.Movie

object Constants {

    const val NEXT_PAGE_KEY = "nextPageKey"
    const val PREVIOUS_PAGE_KEY = "previousPageKey"

    const val NUMBERS_ONLY_EXCEPTION = "Only numbers allowed"
    const val MOVIES_NOT_FOUND_EXCEPTION = "Movies not Found"

    val page1 = listOf(
        Movie(
            id = 1,
            name = "something",
            image = "something",
            description = "something",
            rating = 4.5,
            imdbLink = "something",
            cast = listOf("something", "something")
        )
    )
    val page2 = listOf(
        Movie(
            id = 1,
            name = "something",
            image = "something",
            description = "something",
            rating = 4.5,
            imdbLink = "something",
            cast = listOf("something", "something")
        )
    )
    val page3 = listOf(
        Movie(
            id = 1,
            name = "something",
            image = "something",
            description = "something",
            rating = 4.5,
            imdbLink = "something",
            cast = listOf("something", "something")
        )
    )
    val page4 = listOf(
        Movie(
            id = 1,
            name = "something",
            image = "something",
            description = "something",
            rating = 4.5,
            imdbLink = "something",
            cast = listOf("something", "something")
        )
    )
    val page5 = listOf(
        Movie(
            id = 1,
            name = "something",
            image = "something",
            description = "something",
            rating = 4.5,
            imdbLink = "something",
            cast = listOf("something", "something")
        )
    )
}