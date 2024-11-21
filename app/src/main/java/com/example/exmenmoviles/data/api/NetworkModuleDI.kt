package com.example.exmenmoviles.data.api

import com.example.exmenmoviles.utils.Constants
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Objeto que configura y proporciona una instancia de [FactsAPIService].
 *
 * Este objeto define la configuración de Retrofit y permite obtener una instancia de la interfaz de servicio para realizar llamadas a la API.
 */
object NetworkModuleDI {
    private val gsonFactory: GsonConverterFactory = GsonConverterFactory.create()
    private val okHttpClient: OkHttpClient = OkHttpClient()

    /**
     * Crea e inicializa una instancia de [FactsAPIService].
     *
     * @return Una implementación de la interfaz [FactsAPIService] lista para realizar solicitudes de red.
     *
     * Este método configura un objeto `Retrofit` con la URL base, el cliente HTTP y el convertidor JSON.
     * Luego, crea una instancia del servicio definido en la interfaz [FactsAPIService].
     */
    operator fun invoke(): FactsAPIService {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(gsonFactory)
            .build()
            .create(FactsAPIService::class.java)
    }
}