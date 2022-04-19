package com.example.mapstruct.data

import kotlinx.serialization.Serializable

@Serializable
data class CoordinatesResponse(
    val latitude: String,
    val longitude: String
)