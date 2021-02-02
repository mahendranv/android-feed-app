package com.ex2.jsonfeed.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AuthorSchema(
    @Json(name = "avatar")
    val avatar: String?,
    @Json(name = "name")
    val name: String,
    @Json(name = "url")
    val url: String?
)