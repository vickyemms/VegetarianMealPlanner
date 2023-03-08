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

//        holder.tvRecipeName.text = recipe.name
//        holder.ivRecipePhoto.setImageResource(recipe.imageResourceId)
//        val formattedIngredients = StringBuilder()
//        for (ingredient in recipe.ingredients) {
//            formattedIngredients.append("${ingredient.amount} ${ingredient.unit} ${ingredient.name}\n")
//        }
//        holder.tvRecipeIngredients.text = formattedIngredients.toString().trimEnd()

        holder.btnAddRecipe.setOnClickListener {
            for (ingredient in recipe.ingredients) {
                if(ingredient in (context as MainActivity).ingredients){
                    ingredient.increaseAmount(ingredient.originalAmount)
                } else {
                    (context).ingredients.add(ingredient)
                }
            }
            Toast.makeText(holder.itemView.context, "Added ${recipe.name} to grocery list", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount() = recipes.size
}