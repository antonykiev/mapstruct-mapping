package com.example.mapstruct.data

import kotlinx.serialization.Serializable

@Serializable
data class RegisteredResponse(
    val age: Int,
    val date: String
)