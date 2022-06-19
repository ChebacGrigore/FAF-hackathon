package faf.hackathon.reconnectiingapp.network

import android.provider.SyncStateContract
import okhttp3.Interceptor
import okhttp3.Response

class AppInterceptor : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(
            chain.request().newBuilder().build()
        )
    }

    fun emptyResponseIntercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        val response = chain.proceed(request)
        return if (response.code == 204) response.newBuilder().code(200).build()
        else response
    }
}