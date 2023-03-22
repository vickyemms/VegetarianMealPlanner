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
        val amountString = if (amount == amount.toInt().toDouble()) {
            amount.toInt().toString()
        } else {
            amount.toString()
        }
        return "$amountString $unit $name"
    }

    fun increaseAmount(increment: Double){
        amount += increment
    }
}
