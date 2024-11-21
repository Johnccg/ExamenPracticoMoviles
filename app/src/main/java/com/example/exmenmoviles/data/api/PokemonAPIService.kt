package com.example.pokedex_lab.data.api

import com.example.exmenmoviles.data.api.model.facts.facts
import retrofit2.http.GET
import retrofit2.http.Query

interface PokemonAPIService {
    @GET("hello")
    suspend fun getPokemonList(
        @Query("page") page:Int
    ): facts
}