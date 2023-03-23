package com.example.foodplanner

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
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

        val groceryList = (activity as MainActivity).groceryList

        val recyclerViewGroceryList = view.findViewById<RecyclerView>(R.id.recyclerViewGroceryList)
        val btnAdd = view.findViewById<Button>(R.id.btnAdd)
        val btnRemove = view.findViewById<Button>(R.id.btnRemove)
        val btnClear = view.findViewById<Button>(R.id.btnClear)

        val customOrder = listOf("vegetable", "fruit", "bread", "dairy", "vegetarian",
            "meat", "frozen", "mexican", "asian", "spice", "oil", "condiment", "canned",
            "pasta", "rice", "baking")

        groceryList.sortBy { customOrder.indexOf(it.foodCategory) }

        recyclerViewGroceryList.adapter = GroceryListAdapter(groceryList)

        btnAdd.setOnClickListener{
            addToGroceryList()
        }

        btnRemove.setOnClickListener{
            removeFromGroceryList()
        }

        btnClear.setOnClickListener{
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

        val alertDialogBuilder = AlertDialog.Builder(requireContext())
        alertDialogBuilder.setTitle("Remove all groceries")
        alertDialogBuilder.setMessage("Are you sure you want to remove all groceries?")
        alertDialogBuilder.setPositiveButton("Yes") { _, _ ->
            groceryList.clear()
            recyclerViewGroceryList.adapter = GroceryListAdapter(groceryList)
            recyclerViewGroceryList.adapter?.notifyDataSetChanged()
            Toast.makeText(requireContext(), "All groceries removed", Toast.LENGTH_SHORT).show()
        }
        alertDialogBuilder.setNegativeButton("Cancel") { _, _ ->
            Toast.makeText(requireContext(), "Did not remove any groceries", Toast.LENGTH_SHORT).show()
        }
        alertDialogBuilder.create().show()

    }

    private fun removeFromGroceryList() {

        val groceryList = (activity as MainActivity).groceryList

        if (groceryList.isEmpty()) {
            Toast.makeText(requireContext(), "Grocery List is empty!", Toast.LENGTH_SHORT).show()
            return
        }

        val recyclerViewGroceryList = requireView().findViewById<RecyclerView>(R.id.recyclerViewGroceryList)

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

        val alertDialogBuilder = AlertDialog.Builder(requireContext())
        alertDialogBuilder.setTitle("Remove groceries")
        alertDialogBuilder.setMessage("Are you sure you want to remove these groceries?")
        alertDialogBuilder.setPositiveButton("Yes") { _, _ ->
            checkedItems.forEach { checkedItem ->
                groceryList.removeAll { groceryItem -> groceryItem.toString() == checkedItem }
                recyclerViewGroceryList.adapter = GroceryListAdapter(groceryList)
                recyclerViewGroceryList.adapter?.notifyDataSetChanged()
            }
            Toast.makeText(requireContext(), "Groceries removed", Toast.LENGTH_SHORT).show()

        }
        alertDialogBuilder.setNegativeButton("Cancel") { _, _ ->
            Toast.makeText(requireContext(), "Did not remove any groceries", Toast.LENGTH_SHORT).show()
        }
        alertDialogBuilder.create().show()
    }


    private fun addToGroceryList() {

        val groceryList = (activity as MainActivity).groceryList
        val recyclerViewGroceryList = requireView().findViewById<RecyclerView>(R.id.recyclerViewGroceryList)

        val builder = AlertDialog.Builder(requireContext())
        builder.setTitle("Add ingredient")
        val inflater = requireActivity().layoutInflater
        val dialogView = inflater.inflate(R.layout.dialog_add_ingredient, null)

        builder.setView(dialogView)


        val etIngredientName = dialogView.findViewById<EditText>(R.id.etIngredientName)
        val etIngredientAmount = dialogView.findViewById<EditText>(R.id.etIngredientAmount)
        val etIngredientUnit = dialogView.findViewById<EditText>(R.id.etIngredientUnit)
        val spFoodCategory = dialogView.findViewById<Spinner>(R.id.spFoodCategory)

        builder.setPositiveButton("Add") { _, _ ->

            val name = etIngredientName.text.toString()
            val amount = etIngredientAmount.text.toString().toDouble()
            val unit = etIngredientUnit.text.toString()
            val foodCategory = spFoodCategory.selectedItem.toString()

            val newIngredient = Ingredient(name, amount, unit, foodCategory, false)
            groceryList.add(newIngredient)
            val customOrder = listOf("vegetable", "fruit", "bread", "dairy", "vegetarian",
                "meat", "frozen", "mexican", "asian", "spice", "oil", "condiment", "canned",
                "pasta", "rice", "baking")

            groceryList.sortBy { customOrder.indexOf(it.foodCategory) }
            recyclerViewGroceryList.adapter = GroceryListAdapter(groceryList)
            recyclerViewGroceryList.adapter?.notifyDataSetChanged()
            Toast.makeText(requireContext(), "Added ingredient", Toast.LENGTH_SHORT).show()
        }

        builder.setNegativeButton("Cancel") { _, _ ->
            Toast.makeText(requireContext(), "No ingredient added", Toast.LENGTH_SHORT).show()
        }

        builder.show()

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