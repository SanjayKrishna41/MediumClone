package com.sanjay.api.model.responses


import com.sanjay.api.model.entities.Article
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ArticleResponse(
    @Json(name = "article")
    val article: Article
)