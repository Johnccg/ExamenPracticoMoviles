package com.example.exmenmoviles.framework.views

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.exmenmoviles.data.api.model.facts.Data
import com.example.exmenmoviles.data.network.NetworkModuleDI
import com.example.exmenmoviles.databinding.ActivityHistoryBinding
import com.example.exmenmoviles.framework.adapters.FactsAdapter
import com.example.exmenmoviles.framework.viewmodels.HistoryViewModel

class HistoryActivity: AppCompatActivity() {
    private lateinit var binding: ActivityHistoryBinding
    private val viewModel: HistoryViewModel by viewModels()
    private val adapter: FactsAdapter = FactsAdapter()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        NetworkModuleDI.initializeParse(this)

        initializeBinding()
        initializeObservers()
        viewModel.getFactsList()
    }

    private fun initializeObservers() {
        viewModel.factsLiveData.observe(this, {facts ->
            setUpRecyclerView(facts.result.data)
        })
    }

    private fun initializeBinding() {
        binding = ActivityHistoryBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun setUpRecyclerView(dataForList:ArrayList<Data>){
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