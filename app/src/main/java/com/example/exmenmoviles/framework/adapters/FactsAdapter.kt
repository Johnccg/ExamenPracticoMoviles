package com.example.exmenmoviles.framework.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.exmenmoviles.data.api.model.factsData
import com.example.exmenmoviles.databinding.ItemFactBinding
import com.example.exmenmoviles.framework.adapters.viewholders.FactsViewHolder
import com.example.exmenmoviles.framework.views.HistoryActivity

/**
 * Adaptador de [RecyclerView] de [HistoryActivity] que muestra una lista de hechos.
 * Encargado de administrar la vinculación entre los datos y las vistas en el RecyclerView.
 */
class FactsAdapter:RecyclerView.Adapter<FactsViewHolder>() {
    var data: ArrayList<factsData> = ArrayList()
    private lateinit var context: Context

    /**
     * Crea un nuevo ViewHolder para representar un elemento en el RecyclerView.
     *
     * @param parent El ViewGroup padre en el que se insertará el nuevo ViewHolder.
     * @param viewType El tipo de vista que se debe crear (no utilizado aquí).
     * @return Una instancia de [FactsViewHolder] que representa la celda creada.
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FactsViewHolder {
        val binding = ItemFactBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FactsViewHolder(binding)
    }

    /**
     * Vincula un elemento de datos específico a un ViewHolder, actualizando los componentes visuales
     * de la celda con los datos correspondientes.
     *
     * @param holder El ViewHolder que se vinculará con los datos.
     * @param position La posición del elemento en la lista de datos.
     */
    override fun onBindViewHolder(holder: FactsViewHolder, position: Int) {
        val item = data[position]
        holder.bind(item, context)
    }

    /**
     * Devuelve la cantidad total de elementos en la lista de datos.
     *
     * @return El tamaño de la lista de datos.
     */
    override fun getItemCount(): Int {
        return data.size
    }

    /**
     * Actualiza los datos del adaptador con una nueva lista de hechos y el contexto.
     *
     * @param basicData Una lista de objetos [factsData] que contienen los datos a mostrar.
     * @param context El contexto utilizado para la vinculación de vistas.
     */
    fun factsAdapter(basicData: ArrayList<factsData>, context: Context) {
        this.data = basicData
        this.context = context
    }
}