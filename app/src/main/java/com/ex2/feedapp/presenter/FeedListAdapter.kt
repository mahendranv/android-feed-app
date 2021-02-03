package com.ex2.feedapp.presenter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ex2.core.model.FeedItem
import com.ex2.weather.R

class FeedListAdapter : RecyclerView.Adapter<FeedListAdapter.FeedViewHolder>() {

    private var items: List<FeedItem>? = null

    fun setItems(items: List<FeedItem>) {
        this.items = items
    }

    inner class FeedViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(item: FeedItem) {
            with(itemView) {
                findViewById<TextView>(R.id.titleLabel).text = item.title
                findViewById<TextView>(R.id.dateLabel).text = item.datePublished
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeedViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.li_feed_item, parent, false)
        return FeedViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: FeedViewHolder, position: Int) {
        items?.get(position)?.let { holder.bind(it) }
    }

    override fun getItemCount() = items?.size ?: 0
}
