package com.example.mapstruct.domain

import kotlinx.serialization.Serializable

@Serializable
data class Id(
    val name: String,
    val value: String?,
)