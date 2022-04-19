package com.example.mapstruct.data

import kotlinx.serialization.Serializable

@Serializable
data class TimezoneResponse(
    val description: String,
    val offset: String
)