package com.example.foodplanner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    // A mutable list to hold the grocery list ingredients
    var groceryList: MutableList<Ingredient> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the BottomNavigationView in the activity_main layout
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)

        // Find the NavHostFragment in the activity_main layout
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragment) as NavHostFragment

        // Get the NavController associated with the NavHostFragment
        val navController = navHostFragment.navController

        // Define the top-level destinations for the ActionBar
        val appBarConfiguration = AppBarConfiguration(setOf(R.id.recipesFragment, R.id.calendarFragment, R.id.groceryListFragment))

        // Set up the ActionBar with the NavController and AppBarConfiguration
        setupActionBarWithNavController(navController, appBarConfiguration)

        // Set up the BottomNavigationView with the NavController
        bottomNavigationView.setupWithNavController(navController)
    }

}