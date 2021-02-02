package com.ex2.jsonfeed.modules

import com.ex2.jsonfeed.api.JFFeedApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit

@Module
@InstallIn(SingletonComponent::class)
class JFFeedModule {

    @Provides
    fun feedApi(retrofit: Retrofit): JFFeedApi = retrofit.create(JFFeedApi::class.java)
}