package com.ex2.jsonfeed.api

import com.ex2.jsonfeed.model.FeedResponseSchema
import retrofit2.Response
import retrofit2.http.GET

interface JFFeedApi {

//    https://feeds.npr.org
    @GET("/1019/feed.json")
    suspend fun getFeedItems(): FeedResponseSchema

}