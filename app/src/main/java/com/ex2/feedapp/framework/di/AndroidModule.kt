package com.ex2.feedapp.framework.di

import com.ex2.core.bindings.PreferenceStore
import com.ex2.feedapp.framework.AndroidPreferenceStore
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
abstract class AndroidModule {

    @Binds
    abstract fun providePreferenceStore(store: AndroidPreferenceStore): PreferenceStore

}