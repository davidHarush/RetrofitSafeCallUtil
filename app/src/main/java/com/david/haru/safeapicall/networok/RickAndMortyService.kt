package com.david.haru.safeapicall.networok

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by David Harush
 * On 22/08/2021.
 */
interface RickAndMortyService {

    @GET("character/{character-id}")
    suspend fun getCharacterById(
        @Path("character-id") characterId: Int
    ): Response<Any>



}