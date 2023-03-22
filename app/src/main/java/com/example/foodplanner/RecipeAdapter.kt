package com.example.foodplanner

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
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

            val groceryList = (context as MainActivity).groceryList

            val builder = AlertDialog.Builder(holder.itemView.context)
            builder.setTitle("Add Ingredients (4 portions)")

            val foundAtHomeIngredients = mutableListOf<Ingredient>()
            val notFoundAtHomeIngredients = mutableListOf<Ingredient>()
            recipe.ingredients.forEach { ingredient ->
                if (ingredient.foundAtHome) {
                    foundAtHomeIngredients.add(ingredient)
                } else {
                    notFoundAtHomeIngredients.add(ingredient)
                }
            }

            val ingredientCheckboxes = mutableListOf<CheckBox>()

            val layout = LinearLayout(holder.itemView.context)
            layout.orientation = LinearLayout.VERTICAL

            notFoundAtHomeIngredients.forEach { ingredient ->
                val checkbox = CheckBox(holder.itemView.context)
                checkbox.text = ingredient.toString()
                checkbox.tag = ingredient
                checkbox.isChecked = true
                ingredientCheckboxes.add(checkbox)
                layout.addView(checkbox)
            }

            val foundAtHomeHeader = TextView(holder.itemView.context)
            foundAtHomeHeader.text = context.getString(R.string.found_at_home_header)
            foundAtHomeHeader.textSize = 18F
            layout.addView(foundAtHomeHeader)

            foundAtHomeIngredients.forEach { ingredient ->
                val checkbox = CheckBox(holder.itemView.context)
                checkbox.text = ingredient.toString()
                checkbox.tag = ingredient
                checkbox.isChecked = false
                ingredientCheckboxes.add(checkbox)
                layout.addView(checkbox)
            }

            builder.setView(layout)

            builder.setPositiveButton("Add") { _, _ ->
                for (checkbox in ingredientCheckboxes) {
                    if (checkbox.isChecked) {
                        val checkedIngredient = checkbox.tag as Ingredient

                        var foundIngredient = false

                        for (grocery in groceryList) {
                            if (checkedIngredient.name == grocery.name) {
                                grocery.increaseAmount(checkedIngredient.originalAmount)
                                foundIngredient = true
                                break
                            }
                        }

                        if (!foundIngredient) {
                            groceryList.add(checkedIngredient.copy())
                        }

                    }
                }
                Toast.makeText(
                    holder.itemView.context,
                    "You added ${recipe.name} to your grocery list",
                    Toast.LENGTH_SHORT
                ).show()
            }

            builder.setNegativeButton("Cancel") { dialog, _ ->
                dialog.cancel()
                Toast.makeText(
                    holder.itemView.context,
                    "You did not add any ingredients to your grocery list.",
                    Toast.LENGTH_SHORT
                ).show()
            }
            builder.show()
        }
    }

    override fun getItemCount() = recipes.size
}