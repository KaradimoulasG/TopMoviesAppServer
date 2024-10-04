package com.example.models

import kotlinx.serialization.Serializable

@Serializable
data class ApiResponse(
    val success: Boolean,
    val message: String? = null,
    val previousPage: Int? = null,
    val nextPage: Int? = null,
    val movies: List<Movie> = emptyList(),
    val lastUpdated: Long? = null
)
