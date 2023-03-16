package com.example.foodplanner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class RecipeDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe_details)

        // Set the title of the activity
        title = "Recipe Details"

        // Get the recipe details passed from the intent
        val recipeName = intent.getStringExtra("RECIPE_NAME")
        val recipePhoto = intent.getIntExtra("RECIPE_PHOTO", 0)
        val recipeInstructions = intent.getStringExtra("RECIPE_INSTRUCTIONS")
        val recipeIngredients = intent.getStringExtra("RECIPE_INGREDIENTS")

        // Get the views from the layout
        val tvRecipeNameDetail: TextView = findViewById(R.id.tvRecipeNameDetail)
        val ivRecipePhotoDetail: ImageView = findViewById(R.id.ivRecipePhotoDetail)
        val tvRecipeInstructionsDetail: TextView = findViewById(R.id.tvRecipeInstructionsDetail)
        val tvRecipeIngredientsDetail: TextView = findViewById(R.id.tvRecipeIngredientsDetail)

        // Set the values for the views
        tvRecipeNameDetail.text = recipeName
        ivRecipePhotoDetail.setImageResource(recipePhoto)
        tvRecipeInstructionsDetail.text = recipeInstructions
        tvRecipeIngredientsDetail.text = recipeIngredients
    }
}