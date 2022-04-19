package com.example.mapstruct.domain

data class UserGender(
    val firstName: String,
    val lastName: String,
    val gender: Gender
) {
    enum class Gender {
        male, female
    }
}

