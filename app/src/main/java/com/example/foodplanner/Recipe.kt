package com.example.foodplanner

data class Recipe(
    val name: String,
    val imageResourceId: Int,
    val cuisine: String,
    val protein: String,
    val healthiness: String,
    val ingredients: List<Ingredient>,
    val instructions: String
){
    fun toStringFilters(): String{
        return "$cuisine, \n$protein, \n$healthiness"
    }
}
