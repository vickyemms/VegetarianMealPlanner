package com.example.foodplanner

import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class GroceryListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    // This creates a TextView instance for the grocery item and sets it to the corresponding view in the item_grocery layout.
    val cbGrocery: CheckBox = itemView.findViewById(R.id.cbGrocery)
}