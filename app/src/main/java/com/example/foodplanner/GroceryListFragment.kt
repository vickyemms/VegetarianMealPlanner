package com.example.foodplanner

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
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

    private lateinit var btnAdd: Button
    private  lateinit var btnRemove: Button
    private lateinit var btnClear: Button

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
        val groceryList = (activity as MainActivity).groceryList

        // Find the RecyclerView in the layout.
        val recyclerViewGroceryList = view.findViewById<RecyclerView>(R.id.recyclerViewGroceryList)

        // This is a custom ordering of the grocery categories.
        val customOrder = listOf("vegetable", "fruit", "bread", "dairy", "vegetarian",
            "meat", "frozen", "mexican", "asian", "spice", "oil", "condiment", "canned",
            "pasta", "rice", "baking")

        // Sort the groceryList based on the custom order.
        groceryList.sortBy { customOrder.indexOf(it.foodCategory) }

        // Set the adapter for the RecyclerView.
        recyclerViewGroceryList.adapter = GroceryListAdapter(groceryList)

        btnAdd = view.findViewById(R.id.btnAdd)
        btnRemove = view.findViewById(R.id.btnRemove)
        btnClear = view.findViewById(R.id.btnClear)

        btnAdd.setOnClickListener(){
            addToGroceryList()
        }

        btnRemove.setOnClickListener(){
            removeFromGroceryList()
        }

        btnClear.setOnClickListener(){
            clearGroceryList()
        }
    }

    private fun clearGroceryList() {

        val groceryList = (activity as MainActivity).groceryList

        if (groceryList.isEmpty()) {
            Toast.makeText(requireContext(), "Grocery List is empty!", Toast.LENGTH_SHORT).show()
            return
        }

        val recyclerViewGroceryList = requireView().findViewById<RecyclerView>(R.id.recyclerViewGroceryList)

        // If any checkbox is checked, show the alert dialog
        val alertDialogBuilder = AlertDialog.Builder(requireContext())
        alertDialogBuilder.setTitle("Remove All Groceries")
        alertDialogBuilder.setMessage("Are you sure you want to remove all groceries?")
        alertDialogBuilder.setPositiveButton("Yes") { _, _ ->
            groceryList.clear()
            recyclerViewGroceryList.adapter = GroceryListAdapter(groceryList)
            recyclerViewGroceryList.adapter?.notifyDataSetChanged()
            Toast.makeText(requireContext(), "All groceries removed.", Toast.LENGTH_SHORT).show()
        }
        alertDialogBuilder.setNegativeButton("Cancel") { _, _ ->
            Toast.makeText(requireContext(), "Did not remove any groceries.", Toast.LENGTH_SHORT).show()
        }
        alertDialogBuilder.create().show()

    }

    fun removeFromGroceryList() {

        // Get the groceryList from the MainActivity.
        val groceryList = (activity as MainActivity).groceryList

        if (groceryList.isEmpty()) {
            Toast.makeText(requireContext(), "Grocery List is empty!", Toast.LENGTH_SHORT).show()
            return
        }

        // Find the RecyclerView in the layout.
        val recyclerViewGroceryList = requireView().findViewById<RecyclerView>(R.id.recyclerViewGroceryList)

        // Check if any checkbox is checked and store the checked checkboxes in a separate list
        val checkedItems = mutableListOf<String>()
        for (i in 0 until recyclerViewGroceryList.childCount) {
            val viewHolder = recyclerViewGroceryList.findViewHolderForAdapterPosition(i) as? GroceryListViewHolder
            if (viewHolder != null && viewHolder.cbGrocery.isChecked) {
                checkedItems.add(viewHolder.cbGrocery.text.toString())
            }
        }
        val isAnyChecked = checkedItems.isNotEmpty()

        if (!isAnyChecked) {
            Toast.makeText(requireContext(), "No groceries checked!", Toast.LENGTH_SHORT).show()
            return
        }

        // If any checkbox is checked, show the alert dialog
        val alertDialogBuilder = AlertDialog.Builder(requireContext())
        alertDialogBuilder.setTitle("Remove Grocery")
        alertDialogBuilder.setMessage("Are you sure you want to remove the groceries?")
        alertDialogBuilder.setPositiveButton("Yes") { _, _ ->
            checkedItems.forEach { checkedItem ->
                groceryList.removeAll { groceryItem -> groceryItem.toString() == checkedItem }
                recyclerViewGroceryList.adapter = GroceryListAdapter(groceryList)
                recyclerViewGroceryList.adapter?.notifyDataSetChanged()
            }
            // Do something else after removing checked items from grocery list
            Toast.makeText(requireContext(), "Groceries removed.", Toast.LENGTH_SHORT).show()
        }
        alertDialogBuilder.setNegativeButton("Cancel") { _, _ ->
            Toast.makeText(requireContext(), "Did not remove any groceries.", Toast.LENGTH_SHORT).show()
        }
        alertDialogBuilder.create().show()
    }


    private fun addToGroceryList() {

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