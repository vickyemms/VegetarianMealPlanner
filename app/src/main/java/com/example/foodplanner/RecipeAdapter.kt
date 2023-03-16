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

    // onCreateViewHolder is called when the RecyclerView needs a new ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {

        // Inflate the layout for the recipe item
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_recipe, parent, false)

        // Create and return a new RecipeViewHolder for the inflated layout
        return RecipeViewHolder(itemView)
    }

    // onBindViewHolder is called to bind the data to the ViewHolder
    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {

        // Get the recipe at the given position
        val recipe = recipes[position]

        // Bind the recipe data to the ViewHolder
        holder.bind(recipe)

        // Set up a click listener for the "Add Recipe" button
        holder.btnAddRecipe.setOnClickListener {

            // Get the grocery list from the MainActivity
            val groceryList = (context as MainActivity).groceryList

            // Create an AlertDialog.Builder to display the list of ingredients
            val builder = AlertDialog.Builder(holder.itemView.context)
            builder.setTitle("Add Ingredients")

            // Split the recipe ingredients into those found at home and those not found at home
            val foundAtHomeIngredients = mutableListOf<Ingredient>()
            val notFoundAtHomeIngredients = mutableListOf<Ingredient>()
            recipe.ingredients.forEach { ingredient ->
                if (ingredient.foundAtHome) {
                    foundAtHomeIngredients.add(ingredient)
                } else {
                    notFoundAtHomeIngredients.add(ingredient)
                }
            }

            // Create a list to hold the checkboxes for the ingredients
            val ingredientCheckboxes = mutableListOf<CheckBox>()

            // Create a LinearLayout to hold the checkboxes
            val layout = LinearLayout(holder.itemView.context)
            layout.orientation = LinearLayout.VERTICAL

            // Add a checkbox for each ingredient not found at home
            notFoundAtHomeIngredients.forEach { ingredient ->
                val checkbox = CheckBox(holder.itemView.context)
                checkbox.text =
                    ingredient.amount.toString() + " " + ingredient.unit + " " + ingredient.name
                checkbox.tag = ingredient
                checkbox.isChecked = true
                ingredientCheckboxes.add(checkbox)
                layout.addView(checkbox)
            }

            // Add a header for the ingredients found at home
            val foundAtHomeHeader = TextView(holder.itemView.context)
            foundAtHomeHeader.text = "   Usually found at home"
            foundAtHomeHeader.textSize = 18F
            layout.addView(foundAtHomeHeader)

            // Add a checkbox for each ingredient found at home
            foundAtHomeIngredients.forEach { ingredient ->
                val checkbox = CheckBox(holder.itemView.context)
                checkbox.text =
                    ingredient.amount.toString() + " " + ingredient.unit + " " + ingredient.name
                checkbox.tag = ingredient
                checkbox.isChecked = false
                ingredientCheckboxes.add(checkbox)
                layout.addView(checkbox)
            }

            // Add the LinearLayout to the AlertDialog.Builder
            builder.setView(layout)

            // Set up the positive button to add the selected ingredients
            builder.setPositiveButton("Add") { _, _ ->
                for (checkbox in ingredientCheckboxes) {
                    if (checkbox.isChecked) {
                        val checkedIngredient = checkbox.tag as Ingredient

                        var foundIngredient = false

                        // Check if the ingredient is already in the list
                        for (grocery in groceryList) {
                            if (checkedIngredient.name == grocery.name) {
                                // If the ingredient is already in the list, increase the amount
                                grocery.increaseAmount(checkedIngredient.originalAmount)
                                foundIngredient = true
                                break
                            }
                        }

                        // If the ingredient is not already in the list, add it
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

            // Set up the negative button to cancel the dialog
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