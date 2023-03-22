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

    private val recipes = RecipeData.recipes
    private lateinit var recyclerViewRecipes: RecyclerView
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

        val menuHost: MenuHost = requireActivity()
        menuHost.addMenuProvider(this, viewLifecycleOwner, Lifecycle.State.RESUMED)

        return inflater.inflate(R.layout.fragment_recipes, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerViewRecipes = view.findViewById(R.id.recyclerViewRecipes)
        recyclerViewRecipes.adapter = RecipeAdapter(recipes, requireContext())

    }

    override fun onCreateMenu(menu: Menu, menuInflater: MenuInflater) {
        menuInflater.inflate(R.menu.action_bar_menu, menu)

        val filterMenuItem = menu.findItem(R.id.miFilter)
        filterMenuItem.setOnMenuItemClickListener {

            showFilterDialog()
            true

        }
    }

    override fun onMenuItemSelected(menuItem: MenuItem): Boolean {
        return false
    }

    private fun showFilterDialog() {

        val builder = AlertDialog.Builder(requireContext())
        builder.setTitle("Filter Recipes")
        val inflater = requireActivity().layoutInflater
        val dialogView = inflater.inflate(R.layout.dialog_filter, null)

        builder.setView(dialogView)

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

        builder.setPositiveButton("Apply") { _, _ ->

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

            filteredRecipes = recipes.filter { recipe ->
                shouldIncludeRecipe(recipe, isAsian, isMexican, isMiddleEastern, isMediterranean,
                    isSwedish, isHungarian, isItalian, isAmerican, hasChickpeas, hasLentils,
                    hasBeans, hasTofu, hasSoyProtein, hasPeaProtein, hasNoProtein, hasFalafel,
                    isHealthy, isNeutral, isUnhealthy)
            }

            recyclerViewRecipes.adapter = RecipeAdapter(filteredRecipes, requireContext())
            recyclerViewRecipes.adapter?.notifyDataSetChanged()

            Toast.makeText(requireContext(), "Applying filter", Toast.LENGTH_SHORT).show()
        }

        builder.setNegativeButton("Cancel") { _, _ ->
            Toast.makeText(requireContext(), "No filter applied", Toast.LENGTH_SHORT).show()
        }

        builder.show()
    }

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