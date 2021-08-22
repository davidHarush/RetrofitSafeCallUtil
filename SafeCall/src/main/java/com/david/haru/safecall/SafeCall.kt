package com.david.haru.safecall

import retrofit2.Response

/**
 * Created by David Harush
 * On 22/08/2021.
 */
object SafeCall {
    inline fun <T> fetch(apiCall: () -> Response<T>): SafeResponse<T> {
        return try {
            val response = apiCall()
            return if (response.isSuccessful) {
                SafeResponse.success(response)
            } else {
                SafeResponse.failure(Exception(response.message()))
            }
        } catch (e: Exception) {
            SafeResponse.failure(e)
        }
    }
}