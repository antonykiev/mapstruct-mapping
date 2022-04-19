package com.example.mapstruct.domain

import kotlinx.serialization.Serializable

@Serializable
data class Picture(
    val large: String,
    val medium: String,
    val thumbnail: String
)