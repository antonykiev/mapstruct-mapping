package com.example.mapstruct.domain

import kotlinx.serialization.Serializable

@Serializable
data class Registered(
    val age: Int,
    val date: String
)