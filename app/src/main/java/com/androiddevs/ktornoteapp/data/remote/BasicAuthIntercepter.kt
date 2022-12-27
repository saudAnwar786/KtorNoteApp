package com.androiddevs.ktornoteapp.data.remote

import com.androiddevs.ktornoteapp.others.Constants.IGNORED_URL
import okhttp3.Credentials
import okhttp3.Interceptor
import okhttp3.Response

class BasicAuthIntercepter:Interceptor {
    val email : String? =null
    val password : String? = null
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        if(request.url.encodedPath in IGNORED_URL){
            return chain.proceed(request)
        }

        val authenticatedRequest = request.newBuilder()
            .header("Authorization",Credentials.basic(email?:"",password?:""))
            .build()

        return chain.proceed(authenticatedRequest)
    }
}