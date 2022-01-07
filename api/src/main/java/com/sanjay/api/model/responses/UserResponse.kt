package com.sanjay.api.model.responses


import com.sanjay.api.model.entities.User
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class UserResponse(
    @Json(name = "user")
    val user: User
)