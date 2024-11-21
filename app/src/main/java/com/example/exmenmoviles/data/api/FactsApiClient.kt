package com.example.pokedex_lab.data.api

import com.example.exmenmoviles.data.api.model.factsObject

class FactsApiClient {
    private lateinit var api: FactsAPIService

    suspend fun getFactsList(page:Int): factsObject?{
        api = NetworkModuleDI()
        return try{
            api.getPokemonList(page)
        }catch (e:java.lang.Exception){
            e.printStackTrace()
            null
        }
    }
}