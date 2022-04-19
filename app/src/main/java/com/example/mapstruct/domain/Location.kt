package com.example.mapstruct.domain

import kotlinx.serialization.Serializable

@Serializable
data class Location(
    val city: String,
    val coordinates: Coordinates,
    val postcode: String,
    val state: String,
    val street: String,
    val timezone: Timezone
)