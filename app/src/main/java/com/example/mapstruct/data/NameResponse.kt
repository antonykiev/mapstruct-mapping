package com.example.mapstruct.data

import kotlinx.serialization.Serializable

@Serializable
data class NameResponse(
    val first: String,
    val last: String,
    val title: String
)