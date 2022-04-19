package com.example.mapstruct.data

import kotlinx.serialization.Serializable

@Serializable
data class LocationResponse(
    val city: String,
    val coordinates: CoordinatesResponse,
    val postcode: String,
    val state: String,
    val street: String,
    val timezone: TimezoneResponse
)