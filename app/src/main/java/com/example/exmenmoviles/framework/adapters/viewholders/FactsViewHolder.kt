package com.example.exmenmoviles.framework.adapters.viewholders

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import com.example.exmenmoviles.data.api.model.factsData
import com.example.exmenmoviles.databinding.ItemFactBinding
import com.example.exmenmoviles.framework.views.HistoryActivity

/**
 * ViewHolder para manejar y vincular hechos en el [RecyclerView] de [HistoryActivity].
 *
 * @property binding Enlace de vista que corresponde al objeto que se va a vincular.
 */
class FactsViewHolder(private val binding: ItemFactBinding): RecyclerView.ViewHolder(binding.root) {
    fun bind(item: factsData, context: Context){
        if (item.date.substring(0,1) == "-"){
            binding.TVDate.text = "${item.date.substring(1)} BC"
        } else {
            binding.TVDate.text = "${item.date} AD"
        }
        binding.TVCategory.text = "${item.category1}: ${item.category2}"
        binding.TVDescription.text = item.description
    }
}