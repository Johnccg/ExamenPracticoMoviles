package com.example.exmenmoviles.data.api

import com.example.exmenmoviles.data.api.model.factsObject

/**
 * Cliente de API para obtener datos de hechos desde una rrequest servicio remoto.
 *
 * Esta clase utiliza un servicio definido en [FactsAPIService] para realizar solicitudes
 * a la API
 */
class FactsApiClient {
    private lateinit var api: FactsAPIService

    /**
     * Recupera una lista de hechos desde la API. utiliza el cliente [NetworkModuleDI] para realizar la solicitud.
     * En caso de que haya un error regresa null e imprime el error
     *
     * @param page El número de página que se desea consultar.
     * @return Un objeto [factsObject] que contiene la lista de hechos o `null` si ocurre algún error.
     */
    suspend fun getFactsList(page:Int): factsObject?{
        api = NetworkModuleDI()
        return try{
            api.getFactsList(page)
        }catch (e:java.lang.Exception){
            e.printStackTrace()
            null
        }
    }
}