package com.example.exmenmoviles.data.api.model

import com.google.gson.annotations.SerializedName

/**
 * Representa la respuesta de la base de datos al tratar de buscar hechos.
 *
 * @property result la información de la respuesta
 */
data class factsObject(
    @SerializedName("result") val result: factsResult,
)
