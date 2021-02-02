package com.ex2.jsonfeed.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class FeedResponseSchema(

    @Json(name = "items")
    val items: List<FeedItemSchema>

)
