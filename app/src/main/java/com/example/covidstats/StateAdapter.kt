package com.example.covidstats

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView

class StateAdapter(private val stateList:List<StateModal>) : RecyclerView.Adapter<StateAdapter.StateViewHolder>() {

    class StateViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val stateNameTV:TextView =itemView.findViewById(R.id.idTVState)
        val casesTV:TextView = itemView.findViewById(R.id.idTVCases)
        val deathsTV:TextView = itemView.findViewById(R.id.idTVDeaths)
        val recoveredTV:TextView = itemView.findViewById(R.id.idTVRecovered)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StateViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.state_item,parent,false)
        return StateViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: StateViewHolder, position: Int) {
        val stateData = stateList[position]
        holder.casesTV.text = stateData.cases.toString()
        holder.stateNameTV.text = stateData.state
        holder.deathsTV.text = stateData.deaths.toString()
        holder.recoveredTV.text = stateData.recovered.toString()
    }

    override fun getItemCount(): Int {
        return stateList.size
    }
}