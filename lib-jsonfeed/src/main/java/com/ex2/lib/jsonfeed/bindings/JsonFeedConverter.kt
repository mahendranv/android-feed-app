package com.ex2.lib.jsonfeed.bindings

import com.ex2.lib.specs.bindings.FeedConverter
import com.ex2.lib.specs.model.FeedItem

class JsonFeedConverter : FeedConverter {

    override fun toFeedItem(feedItem: Any): FeedItem {
        
    }

    override fun toFeedItems(items: List<Any>): List<FeedItem> {
        TODO("Not yet implemented")
    }
}