package com.cursokotlin.retrofitkotlinexample.presentation.common.interceptor

import okhttp3.Interceptor
import okhttp3.Response
import okhttp3.logging.HttpLoggingInterceptor
import timber.log.Timber

class InterceptorExample : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request().newBuilder()
            .addHeader("Accept:", "application/json")
            .addHeader("apiKey", "random")
            .build()
        return chain.proceed(request)
    }
}