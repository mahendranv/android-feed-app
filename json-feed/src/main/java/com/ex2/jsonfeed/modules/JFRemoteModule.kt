package com.ex2.jsonfeed.modules

import com.ex2.core.RemoteClient
import com.ex2.jsonfeed.JFRemoteClient
import com.ex2.jsonfeed.api.JFFeedApi
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class JFRemoteModule {

    @Provides
    fun providesRemoteClient(api: JFFeedApi): RemoteClient = JFRemoteClient(api)
}