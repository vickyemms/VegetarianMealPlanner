package com.example.foodplanner

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [GroceryListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class GroceryListFragment : Fragment() {

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
        return inflater.inflate(R.layout.fragment_grocery_list, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Get the groceryList from the MainActivity.
        var groceryList = (activity as MainActivity).groceryList

        // Find the RecyclerView in the layout.
        val recyclerViewGroceryList = view.findViewById<RecyclerView>(R.id.recyclerViewGroceryList)

        // This is a custom ordering of the grocery categories.
        val customOrder = listOf("vegetable", "fruit", "bread", "dairy", "vegetarian",
            "meat", "frozen", "mexican", "asian", "spice", "canned",
            "pasta", "rice", "condiment", "baking", "oil")

        // Sort the groceryList based on the custom order.
        groceryList.sortBy { customOrder.indexOf(it.foodCategory) }

        // Set the adapter for the RecyclerView.
        recyclerViewGroceryList.adapter = GroceryListAdapter(groceryList)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment GroceryListFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            GroceryListFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}