package com.kevinhomorales.recycler.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kevinhomorales.recycler.databinding.SampleRowBinding

class SampleAdapter(): RecyclerView.Adapter<SampleAdapter.RolesViewHolder>() {
    private lateinit var binding: SampleRowBinding
    private var dataList = mutableListOf<String>()

    fun setListData(data: MutableList<String>) {
        dataList = data
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RolesViewHolder {
        binding = SampleRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RolesViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RolesViewHolder, position: Int) {
        val roles = dataList[position]
        holder.bindView(roles)
    }

    override fun getItemCount(): Int {
        return if(dataList.size > 0) {
            dataList.size
        } else {
            0
        }
    }

    inner class RolesViewHolder(private val itemBinding: SampleRowBinding): RecyclerView.ViewHolder(itemBinding.root) {
        fun bindView(number: String) {
            itemBinding.numberId.text = number
        }
    }
}