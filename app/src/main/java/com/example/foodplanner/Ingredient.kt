package com.example.foodplanner

data class Ingredient(
    val name: String,
    var amount: Double,
    val unit: String = "",
    val foodCategory: String,
    val foundAtHome: Boolean,
    val originalAmount: Double = amount)

{
    override fun toString(): String {
        return "$amount $unit $name\n"
    }

    fun increaseAmount(increment: Double){
        amount += increment
    }
}
