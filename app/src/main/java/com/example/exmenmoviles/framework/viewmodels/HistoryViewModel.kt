package com.example.exmenmoviles.framework.viewmodels

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.exmenmoviles.data.api.model.facts.facts
import com.example.exmenmoviles.domain.HistoryRequirement
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HistoryViewModel: ViewModel() {
    val factsLiveData = MutableLiveData<facts>()
    private val historyRequirement = HistoryRequirement()

    fun getFactsList(){
        Log.d("salida", "Llamo a la funcion en view model")
        //Corrutina específica de un ViewModel, mientras el ViewModel viva esta corrutina va a existir
        viewModelScope.launch(Dispatchers.IO) {
            val result = historyRequirement.getFactsListTest(1)
            Log.d("Salida", "${result}")
            CoroutineScope(Dispatchers.Main).launch {
                factsLiveData.postValue(result!!)
            }
        }
    }
}