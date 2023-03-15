package com.example.foodplanner

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class GroceryListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val tvGrocery: TextView = itemView.findViewById(R.id.tvGrocery)
}