package com.sanjay.api

import com.sanjay.api.model.entities.UserCreds
import com.sanjay.api.model.requests.SignUpRequest
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Test
import kotlin.random.Random

class MediumClientTest {

    private val mediumClient = MediumClient()

    @Test
    fun `GET articles`() {
        runBlocking {
            val articles = mediumClient.api.getArticles()
            assertNotNull(articles.body()?.articles)
        }
    }

    @Test
    fun `GET articles by author`() {
        runBlocking {
            val articles = mediumClient.api.getArticles(author = "Gerome")
            assertNotNull(articles.body()?.articles)
        }
    }

    @Test
    fun `GET articles by tag`() {
        runBlocking {
            val articles = mediumClient.api.getArticles(tag = listOf("implementations"))
            assertNotNull(articles.body()?.articles)
        }
    }

    @Test
    fun `GET articles by favorited`() {
        runBlocking {
            val articles = mediumClient.api.getArticles(favorited = "Gerome")
            assertNotNull(articles.body()?.articles)
        }
    }

    @Test
    fun `POST users - create user`() {
        val userCreds = UserCreds(
            email = "testemail${Random.nextInt(999, 9999)}@test.com",
            password = "${Random.nextInt(999999, 99999999)}",
            username = "rand_user${Random.nextInt(9, 99)}"
        )
        runBlocking {
            val userResponse = mediumClient.api.signupUser(SignUpRequest(userCreds))
            assertEquals(userCreds.username,userResponse.body()?.user?.username)
        }
    }
}