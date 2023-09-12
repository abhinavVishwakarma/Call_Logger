package com.example.call_logger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.call_logger.databinding.ActivityMainBinding
import com.example.call_logger.databinding.ActivityMainBinding.bind
import com.example.call_logger.databinding.ActivityMainBinding.inflate

class MainActivity : AppCompatActivity() {
    private lateinit var callAdapter: callAdapter
    private lateinit var dataList: ArrayList<callModel>

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        dataList = ArrayList<callModel>()


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        dataList.add(callModel("8081686757"))
        dataList.add(callModel("8765432148"))
        dataList.add(callModel("8081686757"))

        callAdapter = callAdapter(dataList, this )

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter=callAdapter

    }
}