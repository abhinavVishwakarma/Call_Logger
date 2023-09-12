package com.example.call_logger

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Adapter
import androidx.recyclerview.widget.RecyclerView
import com.example.call_logger.databinding.CallHistoryBinding


class callAdapter (private var dataList:ArrayList<callModel>, private var context: Context?):
    RecyclerView.Adapter<callAdapter.MyViewHolder>() {

inner class MyViewHolder(var binding: CallHistoryBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
var binding=CallHistoryBinding.inflate(LayoutInflater.from(context),parent,false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
holder.binding.mobileNo.text= dataList[position].mobileNo
    }

    override fun getItemCount(): Int {
        return dataList.size
    }


    }
