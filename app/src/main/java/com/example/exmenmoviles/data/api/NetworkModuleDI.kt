package com.example.pokedex_lab.data.api

import com.example.exmenmoviles.utils.Constants
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NetworkModuleDI {
    //ayudan a hacer las llamadas con HTTP y convertir las respuestas en objetos JSON funcionales.
    private val gsonFactory: GsonConverterFactory = GsonConverterFactory.create()
    private val okHttpClient: OkHttpClient = OkHttpClient()

    //invoke es una forma de llamar este método al momento de inicializar una clase o una instancia de esta misma,
    //si bien no es un constructor nos ayuda a pasar un segundo paso y ejecutar este método para dejar más claro el código.
    operator fun invoke(): PokemonAPIService {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(gsonFactory)
            .build()
            .create(PokemonAPIService::class.java)
    }
}