package com.example.exmenmoviles.framework.views

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import com.example.exmenmoviles.data.api.model.factsData
import com.example.exmenmoviles.databinding.ActivityHistoryBinding
import com.example.exmenmoviles.framework.adapters.FactsAdapter
import com.example.exmenmoviles.framework.viewmodels.HistoryViewModel

/**
 * Actividad que muestra una lista de hechos históricos utilizando un RecyclerView.
 */
class HistoryActivity: AppCompatActivity() {
    private lateinit var binding: ActivityHistoryBinding
    private val viewModel: HistoryViewModel by viewModels()
    private val adapter: FactsAdapter = FactsAdapter()

    /**
     * Configura la actividad al momento de su creación.
     *
     * Se encarga de inicializar el enlace de vistas, los observadores para los datos
     * y de realizar la llamada inicial para obtener la lista de hechos.
     *
     * @param savedInstanceState Estado guardado previamente, si existe.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initializeBinding()
        initializeObservers()
        viewModel.getFactsList()
    }

    /**
     * Inicializa los observadores del [HistoryViewModel] para actualizar la interfaz de usuario
     * cuando se reciben nuevos datos de la lista de hechos.
     */
    private fun initializeObservers() {
        viewModel.factsLiveData.observe(this, Observer {facts ->
            val data = facts.result.data
            setUpRecyclerView(data!!)
        })
    }

    /**
     * Configura el enlace de vistas utilizando View Binding.
     */
    private fun initializeBinding() {
        binding = ActivityHistoryBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    /**
     * Configura el RecyclerView para mostrar una lista de hechos históricos.
     *
     * @param dataForList Lista de datos que se mostrarán en el RecyclerView. la lista debe ser una [ArrayList] de tipo [factsData]
     */
    private fun setUpRecyclerView(dataForList:ArrayList<factsData>){
        binding.RVPokemon.setHasFixedSize(true)
        val gridLayoutManager = GridLayoutManager(
            this,
            2,
            GridLayoutManager.VERTICAL,
            false)
        binding.RVPokemon.layoutManager = gridLayoutManager
        adapter.factsAdapter(dataForList, this)
        binding.RVPokemon.adapter = adapter
    }
}