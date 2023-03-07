package com.example.foodplanner

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class GroceryListAdapter(private val groceryListIngredients: List<Ingredient>) : RecyclerView.Adapter<GroceryListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroceryListViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_grocery_list, parent, false)
        return GroceryListViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: GroceryListViewHolder, position: Int) {
        val groceryListIngredients = groceryListIngredients[position]
        holder.tvGroceryListIngredient.text = groceryListIngredients.toString()
    }

    override fun getItemCount() = groceryListIngredients.size
}