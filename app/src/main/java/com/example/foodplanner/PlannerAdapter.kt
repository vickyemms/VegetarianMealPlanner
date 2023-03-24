package com.example.foodplanner

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class PlannerAdapter(private val meals: MutableList<Meal>) : RecyclerView.Adapter<PlannerViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlannerViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_meal, parent, false)
        return PlannerViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: PlannerViewHolder, position: Int) {
        val meal = meals[position]
        holder.tvMeal.text = meal.toString()
    }

    override fun getItemCount() = meals.size
}