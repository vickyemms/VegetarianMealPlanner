package com.example.foodplanner

data class Ingredient(
    val name: String,
    var amount: Double,
    val unit: String = "",
    val originalAmount: Double = amount)

{
    override fun toString(): String {
        return "$amount $unit $name\n"
    }

    fun increaseAmount(increment: Double){
        amount += increment
    }

    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Ingredient) {
            return false
        }
        return this.name == other.name
    }

    override fun hashCode(): Int {
        return name.hashCode()
    }
}
