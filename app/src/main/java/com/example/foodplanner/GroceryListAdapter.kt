package com.example.foodplanner

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class GroceryListAdapter(private val groceryList: MutableList<Ingredient>) : RecyclerView.Adapter<GroceryListViewHolder>() {


    // This function is called when a new ViewHolder is needed.
    // It inflates the item_grocery layout and returns a new GroceryListViewHolder instance.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroceryListViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_grocery, parent, false)
        return GroceryListViewHolder(itemView)
    }

    // This function is called for each item in the groceryList.
    // It sets the text of the TextView in the ViewHolder to the string representation of the current grocery item.
    override fun onBindViewHolder(holder: GroceryListViewHolder, position: Int) {
        val grocery = groceryList[position]
        holder.cbGrocery.text = grocery.toString()
    }

    // This function returns the number of items in the groceryList.
    override fun getItemCount() = groceryList.size
}