package com.example.foodplanner

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecipeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val tvRecipeName: TextView = itemView.findViewById(R.id.tvRecipeName)
    val ivRecipePhoto: ImageView = itemView.findViewById(R.id.ivRecipePhoto)
}