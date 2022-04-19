package com.example.mapstruct.mapper

import com.example.mapstruct.data.*
import com.example.mapstruct.domain.*
import org.mapstruct.Mapper
import org.mapstruct.Mapping
import org.mapstruct.Mappings

@Mapper(
    uses = [
        DobMapper::class,
        IdMapper::class,
        LocationMapper::class,
        LoginMapper::class,
        PictureMapper::class,
        RegisteredMapper::class,
    ]
)
interface UserMapper {

    fun mapResponseToEntity(response: UserResponse): User

    @Mappings(
        Mapping(source = "response.name.first", target = "firstName"),
        Mapping(source = "response.name.last", target = "lastName"),
    )
    fun mapResponseToUserSimple(response: UserResponse): UserSimple

    @Mappings(
        Mapping(source = "response.name.first", target = "firstName"),
        Mapping(source = "response.name.last", target = "lastName"),
        Mapping(source = "response.gender", target = "gender"),
    )
    fun mapResponseToUserGender(response: UserResponse): UserGender

    @Mappings(
        Mapping(source = "response.name.first", target = "firstName"),
        Mapping(source = "response.name.last", target = "lastName"),
        Mapping(target = "id", expression = "java(java.util.UUID.randomUUID().toString())"),
    )
    fun mapResponseToUserWithId(response: UserResponse): UserWithId

    fun mapResponseToEntityList(response: List<UserResponse>): List<User>

}

@Mapper
interface TimezoneMapper {

    fun mapResponseToEntity(response: TimezoneResponse): Timezone

}

@Mapper
interface RegisteredMapper {

    fun mapResponseToEntity(response: RegisteredResponse): Registered

}

@Mapper
interface PictureMapper {

    fun mapResponseToEntity(response: PictureResponse): Picture

}

@Mapper
interface NameMapper {

    fun mapResponseToEntity(response: NameResponse): Name

}

@Mapper
interface LoginMapper {

    fun mapResponseToEntity(response: LoginResponse): Login

}

@Mapper(
    uses = [
        CoordinatesMapper::class,
        TimezoneMapper::class,
    ]
)
interface LocationMapper {

    fun mapResponseToEntity(response: LocationResponse): Location

}

@Mapper
interface IdMapper {

    fun mapResponseToEntity(response: IdResponse): Id

}

@Mapper
interface DobMapper {

    fun mapResponseToEntity(response: DobResponse): Dob

}

@Mapper
interface CoordinatesMapper {

    fun mapResponseToEntity(response: CoordinatesResponse): Coordinates

}