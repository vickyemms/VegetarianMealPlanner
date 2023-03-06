package com.example.foodplanner

data class Recipe(
    val name: String,
    val imageResourceId: Int,
    val ingredients: List<Ingredient>,
    val instructions: String
)
