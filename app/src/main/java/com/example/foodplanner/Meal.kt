package com.example.foodplanner

data class Meal(
    val recipeName: String,
    var portions: Int)

{
    override fun toString(): String {
        return "$recipeName ($portions portions)"
    }

    fun increasePortions(){
        portions += 4
    }
}
