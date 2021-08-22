package com.david.haru.safeapicall.networok

import com.david.haru.safecall.SafeCall
import com.david.haru.safecall.SafeResponse

/**
 * Created by David Harush
 * On 22/08/2021.
 */
class ApiClient(
    private val api: RickAndMortyService
)  {

    suspend fun getCharacterById(character : Int): SafeResponse<Any> {
        return SafeCall.fetch { api.getCharacterById(character) }
    }

}

