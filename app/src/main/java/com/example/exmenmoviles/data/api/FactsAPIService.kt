package com.example.exmenmoviles.data.api

import com.example.exmenmoviles.data.api.model.factsObject
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Query

/**
 * Interfaz que define los métodos para interactuar con la API
 */
interface FactsAPIService {

    /**
     * Realiza una solicitud POST al endpoint "hello" para obtener una lista de hechos.
     *
     * @param page El número de página que se desea consultar.
     * @return Un objeto [factsObject] que contiene la lista de Pokémon obtenidos desde la API.
     *
     * Esta función utiliza los headers
     * - `X-Parse-Application-Id`: Identificador único de la aplicación.
     * - `X-Parse-REST-API-Key`: Llave maestra para realizar solicitudes REST.
     */
    @Headers(
        "X-Parse-Application-Id: APP_ID",
        "X-Parse-REST-API-Key: MASTER_KEY"
    )
    @POST("hello")
    suspend fun getFactsList(
        @Query("page") page:Int
    ): factsObject
}