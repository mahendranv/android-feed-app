package com.ex2.jsonfeed.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class FeedItemSchema(
    @Json(name = "author")
    val author: AuthorSchema?,
    @Json(name = "content_html")
    val contentHtml: String,
    @Json(name = "date_modified")
    val dateModified: String?,
    @Json(name = "date_published")
    val datePublished: String,
    @Json(name = "id")
    val id: String,
    @Json(name = "image")
    val image: String?,
    @Json(name = "summary")
    val summary: String,
    @Json(name = "title")
    val title: String,
    @Json(name = "url")
    val url: String
)