package com.ex2.feedapp.viewmodel.demo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.ex2.core.RemoteClient
import com.ex2.feedapp.viewmodel.FeedViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

class DemoFeedViewModel @Inject constructor(
    private val apiClient: RemoteClient
) : FeedViewModel() {

    class Factory @Inject constructor
        (val apiClient: RemoteClient) : ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return DemoFeedViewModel(apiClient = apiClient) as T
        }
    }

    override val eventLiveData = MutableLiveData<Events>()

    override fun fetchFeeds() {
        eventLiveData.value = Events.Progress(true)
        viewModelScope.launch {
            val result = apiClient.getFeedItems()
            eventLiveData.value = Events.Success(result)
            eventLiveData.value = Events.Progress(false)
        }
    }
}