package com.example.foodplanner

import android.content.res.ColorStateList
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat
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

    // Inflate the menu action bar for the ActionBar
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.action_bar_menu, menu)
        return true
    }

    // Handle clicks on the menu items in the ActionBar
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.miFilter) {
            val filterOptions = arrayOf("Hungarian", "Swedish", "Middle Eastern")
            val selectedFilters = booleanArrayOf(false, false, false)
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Select Filters")
            builder.setMultiChoiceItems(filterOptions, selectedFilters) { dialog, which, isChecked ->
                selectedFilters[which] = isChecked
                val btn = (dialog as AlertDialog).listView.getChildAt(which)
                if (isChecked) {
                    btn.backgroundTintList = ColorStateList.valueOf(ContextCompat.getColor(this, R.color.teal_700))
                } else {
                    btn.backgroundTintList = ColorStateList.valueOf(ContextCompat.getColor(this, R.color.teal_200))
                }
            }
            builder.setPositiveButton("Filter") { dialog, which ->
                Toast.makeText(this, "Applying the filter", Toast.LENGTH_SHORT).show()
                // Perform the filtering action using the selected filters
            }
            builder.setNegativeButton("Cancel") { dialog, which ->
                Toast.makeText(this, "No filter options were made", Toast.LENGTH_SHORT).show()
                // Perform any necessary cleanup or default behavior
            }
            builder.show()
            return true
        }
        return super.onOptionsItemSelected(item)
    }


}