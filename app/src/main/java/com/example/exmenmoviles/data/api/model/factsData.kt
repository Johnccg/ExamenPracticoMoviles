package com.example.exmenmoviles.data.api.model

import com.google.gson.annotations.SerializedName

data class factsData(
    @SerializedName("category1") val category1: String,
    @SerializedName("category2") val category2: String,
    @SerializedName("className") val className: String,
    @SerializedName("date") val date: String,
    @SerializedName("description") val description: String,
    @SerializedName("granularity") val granularity: String,
)