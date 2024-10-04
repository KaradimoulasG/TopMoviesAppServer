package com.example.models

import kotlinx.serialization.Serializable

@Serializable
data class Movie(
    val id: Int,
    val name: String,
    val image: String,
    val description: String,
    val rating: Double,
    val imdbLink: String,
    val cast: List<String>
)
