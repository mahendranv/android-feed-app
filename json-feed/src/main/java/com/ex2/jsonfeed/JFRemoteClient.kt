package com.ex2.jsonfeed

import com.ex2.core.RemoteClient
import com.ex2.core.model.FeedItem
import com.ex2.jsonfeed.api.JFFeedApi
import javax.inject.Inject

class JFRemoteClient @Inject constructor(

    private val api: JFFeedApi

) : RemoteClient {

    override suspend fun getFeedItems(): List<FeedItem> {
        val response = api.getFeedItems()
        println("##### JFRemoteClient.getFeedItems ${response}")
        return emptyList()
    }
}