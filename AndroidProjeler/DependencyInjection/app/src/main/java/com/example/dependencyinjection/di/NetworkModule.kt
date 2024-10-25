package com.example.dependencyinjection.di

import com.example.dependencyinjection.network.AuthInterceptor
import com.example.dependencyinjection.network.OtherInterceptor
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import retrofit2.Retrofit

@Module
@InstallIn(ActivityComponent::class)
object NetworkModule {

    @AuthInterceptorRetrofit
    @Provides
    fun provideAuthRetrofit():Retrofit{
        return Retrofit.Builder()
            .baseUrl("https://google.com")
            //.addInterceptor(AuthInterceptor())
            .build()
    }
    @OtherInterceptorRetrofit
    @Provides
    fun provideOtherRetrofit():Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://google.com")
            //.addInterceptor(OtherInterceptor())
            .build()
    }

}