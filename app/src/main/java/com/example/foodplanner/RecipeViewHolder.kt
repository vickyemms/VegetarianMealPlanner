package com.example.foodplanner

import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecipeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val tvRecipeName: TextView = itemView.findViewById(R.id.tvRecipeName)
    val ivRecipePhoto: ImageView = itemView.findViewById(R.id.ivRecipePhoto)
    val tvRecipeIngredients: TextView = itemView.findViewById(R.id.tvRecipeIngredients)
    val btnAddRecipe: Button = itemView.findViewById(R.id.btnAddRecipe)
}