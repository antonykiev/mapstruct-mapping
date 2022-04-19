package com.example.mapstruct

import com.example.mapstruct.data.UserResponse
import com.example.mapstruct.domain.UserGender
import com.example.mapstruct.mapper.UserMapper
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.decodeFromJsonElement
import org.junit.Test
import org.mapstruct.factory.Mappers

class MapstructTest {

    private val converter = Mappers.getMapper(UserMapper::class.java)

    private val jsonElement = Json.parseToJsonElement(testServerResponseString)
    private val userResponse = Json.decodeFromJsonElement<UserResponse>(jsonElement)

    @Test
    fun testResponseToDomain() {
        val user = converter.mapResponseToEntity(userResponse)

        assert(user.name.last.isNotEmpty())
        assert(user.name.last == "gibson")
    }

    @Test
    fun testResponseToUsers() {
        val userResponseList = List(10) { userResponse }

        val userList = converter.mapResponseToEntityList(userResponseList)

        assert(userList.size == 10)
        assert(userList.first().name.last == "gibson")
    }

    @Test
    fun testResponseToUserSimple() {
        val userSimple = converter.mapResponseToUserSimple(userResponse)

        assert(userSimple.firstName == "brad")
        assert(userSimple.lastName == "gibson")
    }

    @Test
    fun testResponseToUserGender() {
        val userGender = converter.mapResponseToUserGender(userResponse)

        assert(userGender.firstName == "brad")
        assert(userGender.lastName == "gibson")
        assert(userGender.gender == UserGender.Gender.male)
    }

    @Test
    fun testResponseToUserWithId() {
        val userGender = converter.mapResponseToUserWithId(userResponse)

        assert(userGender.firstName == "brad")
        assert(userGender.lastName == "gibson")
        assert(userGender.id.isNotEmpty())
    }


}