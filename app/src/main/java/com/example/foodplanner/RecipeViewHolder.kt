package com.example.foodplanner

import android.content.Intent
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecipeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    // Initialize the UI components for the recipe item
    val tvRecipeName: TextView = itemView.findViewById(R.id.tvRecipeName)
    val ivRecipePhoto: ImageView = itemView.findViewById(R.id.ivRecipePhoto)
    val tvRecipeCategories: TextView = itemView.findViewById(R.id.tvRecipeCategories)
    val btnAddRecipe: Button = itemView.findViewById(R.id.btnAddRecipe)


    // Set a click listener on the item view to launch RecipeDetailsActivity when clicked
    init {
        itemView.setOnClickListener {

            // Get the Recipe object associated with this item
            val recipe = itemView.tag as Recipe

            // Create an intent to launch RecipeDetailsActivity
            val intent = Intent(itemView.context, RecipeDetailsActivity::class.java)

            // Add the Recipe object's details to the intent as extras
            intent.putExtra("RECIPE_NAME", recipe.name)
            intent.putExtra("RECIPE_PHOTO", recipe.imageResourceId)
            intent.putExtra("RECIPE_INSTRUCTIONS", recipe.instructions)
            intent.putExtra("RECIPE_INGREDIENTS", recipe.ingredients.joinToString(""))

            // Launch the activity using the intent
            itemView.context.startActivity(intent)
        }
    }

    // Bind the Recipe object's data to the UI components for this item view
    fun bind(recipe: Recipe) {
        itemView.tag = recipe
        tvRecipeName.text = recipe.name
        ivRecipePhoto.setImageResource(recipe.imageResourceId)
        tvRecipeCategories.text = recipe.toStringFilters()
    }
}