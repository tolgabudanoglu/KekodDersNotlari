package com.example.dependencyinjection.network

import okhttp3.Interceptor
import okhttp3.Response

class OtherInterceptor: Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        TODO("Not yet implemented")
    }
}