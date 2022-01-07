package com.sanjay.api.model.responses


import com.sanjay.api.model.entities.Profile
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ProfileResponse(
    @Json(name = "profile")
    val profile: Profile
)