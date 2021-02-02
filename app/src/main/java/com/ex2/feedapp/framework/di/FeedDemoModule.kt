package com.ex2.feedapp.framework.di

import com.ex2.feedapp.viewmodel.FeedViewModel
import com.ex2.feedapp.viewmodel.demo.DemoFeedViewModel
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent

@InstallIn(FragmentComponent::class)
@Module
abstract class FeedDemoModule {

    @Binds
    abstract fun providesFeedDemoViewModel(feedDemoModule: DemoFeedViewModel) : FeedViewModel
}