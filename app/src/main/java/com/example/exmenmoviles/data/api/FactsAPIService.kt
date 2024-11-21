package com.example.pokedex_lab.data.api

import com.example.exmenmoviles.data.api.model.facts.facts
import retrofit2.http.GET
import retrofit2.http.Query

interface FactsAPIService {
    @GET("hello")
    suspend fun getPokemonList(
        @Query("page") page:Int
    ): facts
}