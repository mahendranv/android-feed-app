package com.ex2.jsonfeed

import com.ex2.core.RemoteClient
import com.ex2.core.model.FeedItem
import com.ex2.jsonfeed.api.JFFeedApi
import com.ex2.jsonfeed.model.toDomainModel
import javax.inject.Inject

class JFRemoteClient @Inject constructor(

    private val api: JFFeedApi

) : RemoteClient {

    override suspend fun getFeedItems(): List<FeedItem> {
        val response = api.getFeedItems()
        return response.items.map {
            it.toDomainModel()
        }
    }
}