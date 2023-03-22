package com.example.foodplanner

import android.view.View
import android.widget.CheckBox
import androidx.recyclerview.widget.RecyclerView


class GroceryListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val cbGrocery: CheckBox = itemView.findViewById(R.id.cbGrocery)
}