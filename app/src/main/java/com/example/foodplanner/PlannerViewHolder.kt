package com.example.foodplanner

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PlannerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val tvMeal: TextView = itemView.findViewById(R.id.tvMeal)
}