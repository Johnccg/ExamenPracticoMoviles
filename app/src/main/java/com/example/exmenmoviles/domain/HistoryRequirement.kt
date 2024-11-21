package com.example.exmenmoviles.domain

import android.util.Log
import com.example.exmenmoviles.data.HistoryRepository
import com.example.exmenmoviles.data.api.model.facts.facts

class HistoryRequirement {
    private val historyRepository = HistoryRepository()

    suspend fun getFactsList(
        page: Int
    ): facts? = historyRepository.getFactsList(page)

    fun getFactsListTest(
        page: Int
    ): facts? = historyRepository.getFactsListTest(page)
}