package com.example.exmenmoviles.data.api.model.facts

data class Result(
    val code: Int,
    val count: Int,
    val `data`: ArrayList<Data>,
    val error: Int?,
    val page: Int
)