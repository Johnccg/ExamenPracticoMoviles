package com.example.exmenmoviles.data.api.model

import com.google.gson.annotations.SerializedName

data class factsResult(
    @SerializedName("code") val code: Int,
    @SerializedName("data") val data: ArrayList<factsData>?,
    @SerializedName("error")val error: String?,
)
