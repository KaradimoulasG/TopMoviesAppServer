package com.example.models

import kotlinx.serialization.Serializable

@Serializable
data class Movie(
    val id: Int,
    val name: String,
    val image: String,
    val description: String,
    val rating: Double,
    val imdbRating: Double,
    val imdbLink: String,
    val director: String,
    val writers: List<String>,
    val topCast: List<String>
)
