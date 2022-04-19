package com.example.mapstruct.data

import kotlinx.serialization.Serializable

@Serializable
data class PictureResponse(
    val large: String,
    val medium: String,
    val thumbnail: String
)