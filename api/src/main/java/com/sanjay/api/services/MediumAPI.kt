package com.sanjay.api.services

import com.sanjay.api.model.entities.UserCreds
import com.sanjay.api.model.requests.SignUpRequest
import com.sanjay.api.model.responses.ArticlesResponse
import com.sanjay.api.model.responses.UserResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface MediumAPI {

    @GET("articles")
    suspend fun getArticles(
        @Query("author") author: String? = null,
        @Query("favorited") favorited: String? = null,
        @Query("tag") tag: List<String>? = null
    ): Response<ArticlesResponse>

    @POST("users")
    suspend fun signupUser(
        @Body userCreds: SignUpRequest
    ) : Response<UserResponse>

}