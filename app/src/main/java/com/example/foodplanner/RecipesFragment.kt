package com.example.foodplanner

import android.os.Bundle
import android.view.*
import android.widget.Toast
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

    private var filteredRecipes: List<Recipe> = RecipeData.recipes

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

        // Get the list of recipes from RecipeData
        val recipes = RecipeData.recipes

        // Find the RecyclerView in the layout and set its adapter to a new instance of RecipeAdapter
        val recyclerViewRecipes = view.findViewById<RecyclerView>(R.id.recyclerViewRecipes)
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

        // Set the positive button click listener
        builder.setPositiveButton("Filter") { _, _ ->
            // Show a toast when the filter button is clicked
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