package com.example.exmenmoviles.framework.viewmodels

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.exmenmoviles.data.api.model.factsObject
import com.example.exmenmoviles.domain.HistoryRequirement
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

/**
 * View Model para conectar la actividad con el manejo de datos de obtener los hechos que se van a mostrar
 * Utiliza [HistoryRequirement] para manejar la lógica tras obtener la iformación de la base de datos
 */
class HistoryViewModel: ViewModel() {
    val factsLiveData = MutableLiveData<factsObject>()
    private val historyRequirement = HistoryRequirement()

    /**
     * Función que inicia una corrutina de View Model para obtener los hechos a mostrar y los publica en el Livedata [factsLiveData].
     * [factsLiveData] contiene un [factsObject]
     * */
    fun getFactsList(){
        Log.d("salida", "Llamo a la funcion en view model")
        viewModelScope.launch(Dispatchers.IO) {
            val result: factsObject? = historyRequirement.getFactsList(1)
            Log.d("Salida", "${result}")
            CoroutineScope(Dispatchers.Main).launch {
                factsLiveData.postValue(result!!)
            }
        }
    }
}