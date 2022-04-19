package com.example.mapstruct.domain

import kotlinx.serialization.Serializable

@Serializable
data class Timezone(
    val description: String,
    val offset: String
)