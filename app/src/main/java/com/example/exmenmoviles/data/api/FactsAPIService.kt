package com.example.pokedex_lab.data.api

import com.example.exmenmoviles.data.api.model.factsObject
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Query

interface FactsAPIService {
    @Headers(
        "X-Parse-Application-Id: APP_ID",
        "X-Parse-REST-API-Key: MASTER_KEY"
    )
    @POST("hello")
    suspend fun getPokemonList(
        @Query("page") page:Int
    ): factsObject
}