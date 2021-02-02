package com.ex2.jsonfeed.modules

import com.squareup.moshi.Moshi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

@InstallIn(SingletonComponent::class)
@Module
class JFCoreModule {

    @Provides
    fun okHttp(): OkHttpClient {
        return OkHttpClient.Builder()
            .build()
    }

    @Provides
    fun moshi(): Moshi {
        return Moshi.Builder()
            .build()
    }

    @Provides
    fun retrofit(okHttpClient: OkHttpClient, moshi: Moshi): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://feeds.npr.org")
            .client(okHttpClient)
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .build()
    }
}