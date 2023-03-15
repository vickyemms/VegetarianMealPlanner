package com.example.foodplanner

import android.content.Intent
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecipeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val tvRecipeName: TextView = itemView.findViewById(R.id.tvRecipeName)
    val ivRecipePhoto: ImageView = itemView.findViewById(R.id.ivRecipePhoto)
    val tvRecipeCategories: TextView = itemView.findViewById(R.id.tvRecipeCategories)
    val btnAddRecipe: Button = itemView.findViewById(R.id.btnAddRecipe)


    init {
        itemView.setOnClickListener {
            val recipe = itemView.tag as Recipe
            val intent = Intent(itemView.context, RecipeDetailActivity::class.java)
            intent.putExtra("RECIPE_NAME", recipe.name)
            intent.putExtra("RECIPE_PHOTO", recipe.imageResourceId)
            intent.putExtra("RECIPE_INSTRUCTIONS", recipe.instructions)
            intent.putExtra("RECIPE_INGREDIENTS", recipe.ingredients.joinToString(""))
            itemView.context.startActivity(intent)
        }
    }



    fun bind(recipe: Recipe) {
        itemView.tag = recipe
        tvRecipeName.text = recipe.name
        ivRecipePhoto.setImageResource(recipe.imageResourceId)
        tvRecipeCategories.text = recipe.toStringFilters()
    }
}