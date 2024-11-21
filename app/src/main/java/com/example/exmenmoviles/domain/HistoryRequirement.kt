package com.example.exmenmoviles.domain

import android.util.Log
import com.example.exmenmoviles.data.HistoryRepository
import com.example.exmenmoviles.data.api.model.facts.facts
import com.example.exmenmoviles.data.api.model.factsObject

/**
 * Clase encargada de la lógica tras obtener los datos de la base de datos
 * Requiere de [HistoryRepository] para obtener la información necesaria para las comparaciones
 * */
class HistoryRequirement {
    private val historyRepository = HistoryRepository()

    /**
     * Obtiene una lista de hechos desde el repositorio, si la llamada falla realiza otra llamada hasta que recibe una respuesta que no falle
     *
     * @param page El número de página que se desea consultar.
     * @return Un objeto [factsObject] que contiene los hechos obtenidos
     */
    suspend fun getFactsList(
        page: Int
    ): factsObject?{
        Log.d("salida", "Llamo a la funcion en requirement")
        var result = historyRepository.getFactsList(page)
        Log.d("Salida", result?.result?.code.toString())
        while (result?.result?.code == 400){
            result = historyRepository.getFactsList(page)
            Log.d("Salida", result?.result?.code.toString())
        }
        return result
    }

    /**
     * Obtiene datos de prueba siguiendo MVVM para simular una llamada a la base de datos
     * */
    fun getFactsListTest(
        page: Int
    ): factsObject? = historyRepository.getFactsListTest(page)

    /**
     * Obtiene datos de prueba siguiendo MVVM para simular una llamada a la base de datos que falle
     * */
    fun getFactsListTestError(
        page: Int
    ): factsObject?{
        var result = historyRepository.getFactsListTestError(page)
        Log.d("Salida", result?.result?.code.toString())
        while (result?.result?.code == 400){
            result = historyRepository.getFactsListTest(page)
            Log.d("Salida", result?.result?.code.toString())
        }
        return result
    }
}