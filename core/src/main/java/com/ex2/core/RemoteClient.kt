package com.ex2.core

import com.ex2.core.model.FeedItem

interface RemoteClient {

    suspend fun getFeedItems(): List<FeedItem>
}