package com.example.foodplanner

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RecipeAdapter(private val recipes: List<Recipe>, private val context: Context) : RecyclerView.Adapter<RecipeViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_recipe, parent, false)
        return RecipeViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        val recipe = recipes[position]
        holder.bind(recipe)

        holder.btnAddRecipe.setOnClickListener {
            val ingredientsList = (context as MainActivity).ingredients

            for (recipeIngredient in recipe.ingredients) {
                var foundIngredient = false

                // Check if the ingredient is already in the list
                for (listIngredient in ingredientsList) {
                    if (recipeIngredient.name == listIngredient.name) {
                        // If the ingredient is already in the list, increase the amount
                        listIngredient.increaseAmount(recipeIngredient.originalAmount)
                        foundIngredient = true
                        break
                    }
                }

                // If the ingredient is not already in the list, add it
                if (!foundIngredient) {
                    val duplicatedIngredient = recipeIngredient.copy()
                    ingredientsList.add(duplicatedIngredient)
                }
            }

            Toast.makeText(holder.itemView.context, "Added ${recipe.name} to grocery list", Toast.LENGTH_SHORT).show()
        }


    }

    override fun getItemCount() = recipes.size
}