package com.sanjay.api.model.requests


import com.sanjay.api.model.entities.UserCreds
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SignUpRequest(
    @Json(name = "user")
    val userCreds: UserCreds
)