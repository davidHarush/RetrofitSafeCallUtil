package com.david.haru.safeapicall

import com.david.haru.safeapicall.networok.NetworkLayer

/**
 * Created by David Harush
 * On 22/08/2021.
 */
object MainRepository {


    suspend fun getCharacterById(characterId: Int): Any? {
        val request = NetworkLayer.apiClient.getCharacterById(2)
        if (request.failed || !request.isSuccessful) {
            return null
        }
        return request.body
    }
}