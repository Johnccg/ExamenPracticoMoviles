package com.example.exmenmoviles.framework.adapters.viewholders

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import com.example.exmenmoviles.data.api.model.facts.Data
import com.example.exmenmoviles.databinding.ItemFactBinding

class FactsViewHolder(private val binding: ItemFactBinding): RecyclerView.ViewHolder(binding.root) {
    fun bind(item: Data, context: Context){
        binding.TVDate.text = item.date
        binding.TVCategory.text = "${item.category1}: ${item.category2}"
        binding.TVDescription.text = item.description
    }
}