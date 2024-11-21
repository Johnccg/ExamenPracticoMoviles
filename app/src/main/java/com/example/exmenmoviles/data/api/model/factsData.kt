package com.example.exmenmoviles.data.api.model

import com.google.gson.annotations.SerializedName

/**
 * Representa los datos de un hecho
 *
 * @property category1 La primera categoría asociada al hecho.
 * @property category2 La segunda categoría asociada al hecho.
 * @property className El nombre de la clase a la que pertenece el hecho.
 * @property date La fecha del hecho
 * @property description La descripción del hecho.
 * @property granularity El nivel de detalle asociado al hecho.
 */
data class factsData(
    @SerializedName("category1") val category1: String,
    @SerializedName("category2") val category2: String,
    @SerializedName("className") val className: String,
    @SerializedName("date") val date: String,
    @SerializedName("description") val description: String,
    @SerializedName("granularity") val granularity: String,
)