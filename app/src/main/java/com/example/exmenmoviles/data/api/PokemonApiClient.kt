package com.example.pokedex_lab.data.api

import com.example.exmenmoviles.data.api.model.facts.facts

class PokemonApiClient {
    private lateinit var api: PokemonAPIService

    suspend fun getFactsList(page:Int): facts?{
        api = NetworkModuleDI()
        return try{
            api.getPokemonList(page)
        }catch (e:java.lang.Exception){
            e.printStackTrace()
            null
        }
    }
}