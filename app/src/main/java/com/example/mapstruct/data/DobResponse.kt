package com.example.mapstruct.data

import kotlinx.serialization.Serializable

@Serializable
data class DobResponse(
    val age: Int,
    val date: String
)