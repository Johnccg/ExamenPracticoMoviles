package com.example.exmenmoviles.framework.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.exmenmoviles.data.api.model.facts.Data
import com.example.exmenmoviles.databinding.ItemFactBinding
import com.example.exmenmoviles.framework.adapters.viewholders.FactsViewHolder

class FactsAdapter:RecyclerView.Adapter<FactsViewHolder>() {
    var data: ArrayList<Data> = ArrayList()
    private lateinit var context: Context

    //le dice al RecyclerView que layout vamos a utilizar
    // e igualmente observa que utilizamos la forma del binding para cargar los componentes de la vista.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FactsViewHolder {
        val binding = ItemFactBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FactsViewHolder(binding)
    }

    //es el encargado de pintar la celda utiliza el ViewHolder que es literalmente
    //el encargado de conectar los componentes de una celda con el dato particular de la lista
    override fun onBindViewHolder(holder: FactsViewHolder, position: Int) {
        val item = data[position]
        holder.bind(item, context)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    fun factsAdapter(basicData: ArrayList<Data>, context: Context) {
        this.data = basicData
        this.context = context
    }
}