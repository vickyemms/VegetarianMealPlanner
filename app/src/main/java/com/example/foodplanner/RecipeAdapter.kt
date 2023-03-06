package com.example.foodplanner

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RecipeAdapter(private val recipes: List<Recipe>) : RecyclerView.Adapter<RecipeViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_recipe, parent, false)
        return RecipeViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        val recipe = recipes[position]
        holder.tvRecipeName.text = recipe.name
        holder.ivRecipePhoto.setImageResource(recipe.imageResourceId)
        val formattedIngredients = StringBuilder()
        for (ingredient in recipe.ingredients) {
            formattedIngredients.append("${ingredient.amount} ${ingredient.unit} ${ingredient.name}\n")
        }
        holder.tvRecipeIngredients.text = formattedIngredients.toString().trimEnd()
    }

    override fun getItemCount() = recipes.size
}