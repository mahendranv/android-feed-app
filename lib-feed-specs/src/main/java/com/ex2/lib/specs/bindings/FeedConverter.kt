package com.ex2.lib.specs.bindings

import com.ex2.lib.specs.model.FeedItem

/**
 * Feed converter converts schema to domain com.ex2.core.model
 */
interface FeedConverter {

    fun toFeedItem(feedItem: Any): FeedItem

    fun toFeedItems(items: List<Any>): List<FeedItem>
}