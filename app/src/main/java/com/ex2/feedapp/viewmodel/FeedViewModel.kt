package com.ex2.feedapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ex2.core.model.FeedItem
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch

abstract class FeedViewModel : ViewModel() {

    abstract val eventLiveData: LiveData<Events>

    abstract fun fetchFeeds()


    sealed class Events {

        class Success(val items: List<FeedItem>) : Events()

        class Progress(val show: Boolean) : Events()

    }
}