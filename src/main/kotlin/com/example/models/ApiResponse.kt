package com.example.models

import kotlinx.serialization.Serializable

@Serializable
data class ApiResponse<T>(
    val success: Boolean,
    val message: String? = null,
    val previousPage: Int? = null,
    val nextPage: Int? = null,
//    val movies: List<Movie> = emptyList(),
    val data: T? = null,
    val lastUpdated: Long? = null
)
