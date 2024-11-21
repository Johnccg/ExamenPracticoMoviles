package com.example.exmenmoviles.data.api.model

import com.google.gson.annotations.SerializedName

/**
 * Representa la información de la respuesta de la base de datos al tratar de buscar hechos.
 *
 * @property code Código de respuesta de la solicitud
 * @property data Lista de datos de tipo [factsData] asociados con la respuesta
 * @property error Mensaje de error devuelto por el servidor en caso de un error
 */
data class factsResult(
    @SerializedName("code") val code: Int,
    @SerializedName("data") val data: ArrayList<factsData>?,
    @SerializedName("error")val error: String?,
)
