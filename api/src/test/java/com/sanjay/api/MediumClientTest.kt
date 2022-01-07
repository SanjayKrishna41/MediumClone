package com.sanjay.api

import org.junit.Assert.assertNotNull
import org.junit.Test

class MediumClientTest {

    private val mediumClient = MediumClient()

    @Test
    fun `GET articles`() {
        val articles = mediumClient.api.getArticles().execute()
        assertNotNull(articles.body()?.articles)
    }
}