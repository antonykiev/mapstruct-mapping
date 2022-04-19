package com.example.mapstruct.data

import kotlinx.serialization.Serializable

@Serializable
data class IdResponse(
    val name: String,
    val value: String?,
)