package com.example.foodplanner

import android.os.Bundle
import android.view.*
import android.widget.Toast
import android.widget.ToggleButton
import androidx.appcompat.app.AlertDialog
import androidx.core.view.MenuHost
import androidx.core.view.MenuProvider
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.recyclerview.widget.RecyclerView
import data.RecipeData

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [RecipesFragment.newInstance] factory method to
 * create an instance of this fragment.
 */

class RecipesFragment : Fragment(), MenuProvider {

    // Get the list of recipes from RecipeData
    private val recipes = RecipeData.recipes

    //Declare recyclerViewRecipes
    private lateinit var recyclerViewRecipes: RecyclerView

    // Define a variable to hold the filtered list of recipes
    private var filteredRecipes: List<Recipe> = listOf()

    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Get a reference to the parent activity that implements the MenuHost interface
        val menuHost: MenuHost = requireActivity()

        // Add this fragment as a menu provider to the parent activity
        // This allows the fragment to handle menu-related events
        menuHost.addMenuProvider(this, viewLifecycleOwner, Lifecycle.State.RESUMED)

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_recipes, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Find recycler view in the layout
        recyclerViewRecipes = view.findViewById(R.id.recyclerViewRecipes)
        // Set recycler views adapter to a new instance of RecipeAdapter
        recyclerViewRecipes.adapter = RecipeAdapter(recipes, requireContext())

    }

    override fun onCreateMenu(menu: Menu, menuInflater: MenuInflater) {
        menuInflater.inflate(R.menu.action_bar_menu, menu)

        // Get a reference to the filter menu item
        val filterMenuItem = menu.findItem(R.id.miFilter)

        // Set the click listener for the filter menu item
        filterMenuItem.setOnMenuItemClickListener {

            // Show the filter dialog
            showFilterDialog()

            // Return true to indicate that the click event has been handled
            true
        }
    }

    override fun onMenuItemSelected(menuItem: MenuItem): Boolean {
        return false
    }

    private fun showFilterDialog() {

        // Create a new AlertDialog Builder
        val builder = AlertDialog.Builder(requireContext())

        // Set the dialog title
        builder.setTitle("Filter Recipes")

        // Get the layout inflater
        val inflater = requireActivity().layoutInflater

        // Inflate the dialog view
        val dialogView = inflater.inflate(R.layout.dialog_filter, null)

        // Add the dialog view to the builder
        builder.setView(dialogView)

        // Get references to the filter UI components
        val tbAsian = dialogView.findViewById<ToggleButton>(R.id.tbAsian)
        val tbMexican = dialogView.findViewById<ToggleButton>(R.id.tbMexican)
        val tbMiddleEastern = dialogView.findViewById<ToggleButton>(R.id.tbMiddleEastern)
        val tbMediterranean = dialogView.findViewById<ToggleButton>(R.id.tbMediterranean)
        val tbSwedish = dialogView.findViewById<ToggleButton>(R.id.tbSwedish)
        val tbHungarian = dialogView.findViewById<ToggleButton>(R.id.tbHungarian)
        val tbItalian = dialogView.findViewById<ToggleButton>(R.id.tbItalian)
        val tbAmerican = dialogView.findViewById<ToggleButton>(R.id.tbAmerican)
        val tbChickpeas = dialogView.findViewById<ToggleButton>(R.id.tbChickpeas)
        val tbBeans = dialogView.findViewById<ToggleButton>(R.id.tbBeans)
        val tbLentils = dialogView.findViewById<ToggleButton>(R.id.tbLentils)
        val tbTofu = dialogView.findViewById<ToggleButton>(R.id.tbTofu)
        val tbFalafel = dialogView.findViewById<ToggleButton>(R.id.tbFalafel)
        val tbSoyProtein = dialogView.findViewById<ToggleButton>(R.id.tbSoyProtein)
        val tbPeaProtein = dialogView.findViewById<ToggleButton>(R.id.tbPeaProtein)
        val tbNoProtein = dialogView.findViewById<ToggleButton>(R.id.tbNoProtein)
        val tbHealthy = dialogView.findViewById<ToggleButton>(R.id.tbHealthy)
        val tbNeutral = dialogView.findViewById<ToggleButton>(R.id.tbNeutral)
        val tbUnhealthy = dialogView.findViewById<ToggleButton>(R.id.tbUnhealthy)


        // Set the positive button click listener
        builder.setPositiveButton("Apply") { _, _ ->

            // Get the selected filter options
            val isAsian = tbAsian.isChecked
            val isMexican = tbMexican.isChecked
            val isMiddleEastern = tbMiddleEastern.isChecked
            val isMediterranean = tbMediterranean.isChecked
            val isSwedish = tbSwedish.isChecked
            val isHungarian = tbHungarian.isChecked
            val isItalian = tbItalian.isChecked
            val isAmerican = tbAmerican.isChecked
            val hasChickpeas = tbChickpeas.isChecked
            val hasBeans = tbBeans.isChecked
            val hasLentils = tbLentils.isChecked
            val hasTofu = tbTofu.isChecked
            val hasFalafel = tbFalafel.isChecked
            val hasSoyProtein = tbSoyProtein.isChecked
            val hasPeaProtein = tbPeaProtein.isChecked
            val hasNoProtein = tbNoProtein.isChecked
            val isHealthy = tbHealthy.isChecked
            val isNeutral = tbNeutral.isChecked
            val isUnhealthy = tbUnhealthy.isChecked

            // Filter the recipe list based on the selected options
            filteredRecipes = recipes.filter { recipe ->
                shouldIncludeRecipe(recipe, isAsian, isMexican, isMiddleEastern, isMediterranean,
                    isSwedish, isHungarian, isItalian, isAmerican, hasChickpeas, hasLentils,
                    hasBeans, hasTofu, hasSoyProtein, hasPeaProtein, hasNoProtein, hasFalafel,
                    isHealthy, isNeutral, isUnhealthy)
            }

            //Update recipes
            recyclerViewRecipes.adapter = RecipeAdapter(filteredRecipes, requireContext())

            // Notify the RecyclerView adapter that the recipe list has changed
            recyclerViewRecipes.adapter?.notifyDataSetChanged()

            // Show a toast to indicate that the filter has been applied
            Toast.makeText(requireContext(), "Applying filter", Toast.LENGTH_SHORT).show()
        }

        // Set the negative button click listener
        builder.setNegativeButton("Cancel") { _, _ ->
            // Show a toast when the cancel button is clicked
            Toast.makeText(requireContext(), "No filter applied", Toast.LENGTH_SHORT).show()
        }

        // Show the dialog
        builder.show()
    }

    //Determines whether a given recipe should be included in the filtered list based on the provided
    private fun shouldIncludeRecipe(recipe: Recipe, isAsian: Boolean, isMexican: Boolean,
                                    isMiddleEastern: Boolean, isMediterranean: Boolean,
                                    isSwedish: Boolean, isHungarian: Boolean, isItalian: Boolean,
                                    isAmerican: Boolean, hasChickpeas: Boolean, hasLentils: Boolean,
                                    hasBeans: Boolean, hasTofu: Boolean, hasSoyProtein: Boolean,
                                    hasPeaProtein: Boolean, hasNoProtein: Boolean, hasFalafel: Boolean,
                                    isHealthy: Boolean, isNeutral: Boolean, isUnhealthy: Boolean): Boolean {
        if (isAsian && recipe.cuisine != "Asian") return false
        if (isMexican && recipe.cuisine != "Mexican") return false
        if (isMiddleEastern && recipe.cuisine != "Middle Eastern") return false
        if (isMediterranean && recipe.cuisine != "Mediterranean") return false
        if (isSwedish && recipe.cuisine != "Swedish") return false
        if (isHungarian && recipe.cuisine != "Hungarian") return false
        if (isItalian && recipe.cuisine != "Italian") return false
        if (isAmerican && recipe.cuisine != "American") return false
        if (hasChickpeas && recipe.protein != "Chickpeas") return false
        if (hasLentils && recipe.protein != "Lentils") return false
        if (hasBeans && recipe.protein != "Beans") return false
        if (hasTofu && recipe.protein != "Tofu") return false
        if (hasSoyProtein && recipe.protein != "Soy protein") return false
        if (hasPeaProtein && recipe.protein != "Pea protein") return false
        if (hasNoProtein && recipe.protein != "No protein") return false
        if (hasFalafel && recipe.protein != "Falafel") return false
        if (isHealthy && recipe.healthiness != "Healthy") return false
        if (isNeutral && recipe.healthiness != "Neutral") return false
        if (isUnhealthy && recipe.healthiness != "Unhealthy") return false
        return true
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment RecipesFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            RecipesFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

}