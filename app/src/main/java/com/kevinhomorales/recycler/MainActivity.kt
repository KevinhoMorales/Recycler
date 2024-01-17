package com.kevinhomorales.recycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.kevinhomorales.recycler.adapter.SampleAdapter
import com.kevinhomorales.recycler.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private lateinit var sampleAdapter: SampleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpView()
    }

    private fun setUpView() {
        setRecycler()
    }

    private fun setRecycler() {
        sampleAdapter = SampleAdapter()
        binding.recyclerId.layoutManager = LinearLayoutManager(this)
        binding.recyclerId.adapter = sampleAdapter
        val list = mutableListOf<String>()
        for (i in 1..100) {
            list.add("Número $i")
        }
        sampleAdapter.setListData(list)
    }
}