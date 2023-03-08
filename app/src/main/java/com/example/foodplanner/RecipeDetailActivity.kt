package com.example.foodplanner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class RecipeDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe_detail)
        title = "Recipe Details"

        val recipeName = intent.getStringExtra("RECIPE_NAME")
        val recipePhoto = intent.getIntExtra("RECIPE_PHOTO", 0)
        val recipeInstructions = intent.getStringExtra("RECIPE_INSTRUCTIONS")
        val recipeIngredients = intent.getStringExtra("RECIPE_INGREDIENTS")

        val tvRecipeNameDetail: TextView = findViewById(R.id.tvRecipeNameDetail)
        val ivRecipePhotoDetail: ImageView = findViewById(R.id.ivRecipePhotoDetail)
        val tvRecipeInstructionsDetail: TextView = findViewById(R.id.tvRecipeInstructionsDetail)
        val tvRecipeIngredientsDetail: TextView = findViewById(R.id.tvRecipeIngredientsDetail)

        tvRecipeNameDetail.text = recipeName
        ivRecipePhotoDetail.setImageResource(recipePhoto)
        tvRecipeInstructionsDetail.text = recipeInstructions
        tvRecipeIngredientsDetail.text = recipeIngredients
    }
}