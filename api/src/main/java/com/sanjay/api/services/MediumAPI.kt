package com.sanjay.api.services

import com.sanjay.api.model.ArticlesResponse
import retrofit2.Call
import retrofit2.http.GET

interface MediumAPI {

    @GET("articles")
    fun getArticles() : Call<ArticlesResponse>
}