package com.david.haru.safecall

import retrofit2.Response

/**
 * Created by David Harush
 * On 22/08/2021.
 */

data class SafeResponse<T> internal constructor(
    val status: Status,
    val data: Response<T>?,
    val exception: Exception?
) {

    sealed class Status {
        object Success : Status()
        object Failure : Status()
    }

    companion object {
        fun <T> success(data: Response<T>): SafeResponse<T> = SafeResponse(
            status = Status.Success,
            data = data,
            exception = null
        )

        fun <T> failure(exception: Exception): SafeResponse<T> = SafeResponse(
            status = Status.Failure,
            data = null,
            exception = exception
        )

    }

    val failed: Boolean
        get() = this.status == Status.Failure

    val isSuccessful: Boolean
        get() = !failed && this.data?.isSuccessful == true

    val body: T
        get() = this.data!!.body()!!

    val bodyNullable: T?
        get() = this.data?.body()

}

