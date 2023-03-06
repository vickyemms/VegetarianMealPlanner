package com.example.foodplanner

data class Ingredient(
    val name: String,
    val amount: Double,
    val unit: String = "")
{
    override fun toString(): String {
        return "$amount $unit $name\n"
    }
}
