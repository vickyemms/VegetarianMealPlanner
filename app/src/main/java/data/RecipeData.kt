package data

import com.example.foodplanner.Ingredient
import com.example.foodplanner.R
import com.example.foodplanner.Recipe

object RecipeData {
    val recipes = listOf(
        Recipe(
            "Daal",
            R.drawable.daal,
            listOf(
                Ingredient("Onion", 1.0, "", "vegetable"),
                Ingredient("Garlic", 3.0, "cloves of", "vegetable"),
                Ingredient("Ginger", 25.0, "g", "vegetable"),
                Ingredient("Carrot", 2.0, "", "vegetable"),
                Ingredient("Chili pepper", 0.5, "", "vegetable"),
                Ingredient("Tomato", 3.0, "", "vegetable"),
                Ingredient("Lime", 1.0, "", "fruit"),
                Ingredient("Coconut milk", 1.0, "dl", "asian"),
                Ingredient("Red lentils", 3.0, "dl", "canned"),
                Ingredient("Rice", 2.0, "dl", "rice"),
                Ingredient("Cumin", 1.0, "tsp", "spice"),
                Ingredient("Garam masala", 1.0, "tsp", "spice"),
                Ingredient("Turmeric", 1.0, "tsp", "spice"),
                Ingredient("Salt", 2.0, "tsp", "baking"),
                Ingredient("Black pepper", 1.0, "tsp", "spice"),
                Ingredient("Olive oil", 2.0, "tbsp", "oil"),
            ),
            "1. Heat up olive oil and start cooking the rice. \n" +
                    "2. Cut and chop the onion, garlic, ginger, carrots, chili pepper and tomatoes. \n" +
                    "3. Add the onions and cook until tender for about 2-3 minutes.\n" +
                    "4. Add the garlic, ginger, carrots, chili pepper, cumin, garam masala and turmeric and cook for about 3-4 minutes.\n" +
                    "5. Heat up 6 dl of water and add the red lentils and the water. Let it cook for about 20 minutes. Add salt and black pepper. \n" +
                    "6. Add the chopped tomatoes and coconut milk. Squeeze half a lime to the mix. Let it simmer for 10 minutes.\n" +
                    "5. Serve with the cooked rice."
        ),
        Recipe(
            "Chickpea Curry",
            R.drawable.chickpea_curry,
            listOf(
                Ingredient("Red onion", 1.0, "", "vegetable"),
                Ingredient("Garlic", 2.0, "cloves of", "vegetable"),
                Ingredient("Ginger", 20.0, "g", "vegetable"),
                Ingredient("Chili pepper", 0.5, "", "vegetable"),
                Ingredient("Crushed tomatoes", 390.0, "g", "canned"),
                Ingredient("Coconut milk", 1.0, "dl", "asian"),
                Ingredient("Chickpeas", 400.0, "g", "canned"),
                Ingredient("Spinache", 125.0, "g", "frozen"),
                Ingredient("Cumin", 1.0, "tsp", "spice"),
                Ingredient("Garam masala", 1.0, "tsp", "spice"),
                Ingredient("Turmeric", 1.0, "tsp", "spice"),
                Ingredient("Paprika", 1.0, "tsp", "spice"),
                Ingredient("Salt", 2.0, "tsp", "baking"),
                Ingredient("Olive oil", 2.0, "tbsp", "oil")
            ),
            "1. Do this \n" +
                    "2. Do this \n" +
                    "3. Do this\n" +
                    "4. Do this\n" +
                    "5. Do this"
        ),
        Recipe(
            "Fried Rice with Tofu",
            R.drawable.fried_rice_tofu,
            listOf(
                Ingredient("Frozen vegetables", 450.0, "g", "frozen"),
                Ingredient("Tofu", 400.0, "g", "vegetarian"),
                Ingredient("Rice", 2.0, "dl", "rice"),
                Ingredient("Soy sauce", 2.0, "tbsp", "asian"),
                Ingredient("Lemon pepper", 1.0, "tsp", "spice"),
                Ingredient("Salt", 1.0, "tsp", "baking"),
                Ingredient("Olive oil", 2.0, "tbsp", "oil")
            ),
            "1. Do this \n" +
                    "2. Do this \n" +
                    "3. Do this\n" +
                    "4. Do this\n" +
                    "5. Do this"
        ),
        Recipe(
            "Noodle Stir Fry with Tofu",
            R.drawable.noodle_stir_fry,
            listOf(
                Ingredient("Frozen vegetables", 450.0, "g", "frozen"),
                Ingredient("Tofu", 400.0, "g", "vegetarian"),
                Ingredient("Noodles", 200.0, "g", "asian"),
                Ingredient("Soy sauce", 2.0, "tbsp", "asian"),
                Ingredient("Lemon pepper", 1.0, "tsp", "spice"),
                Ingredient("Salt", 1.0, "tsp", "baking"),
                Ingredient("Olive oil", 2.0, "tbsp", "oil")
            ),
            "1. Do this \n" +
                    "2. Do this \n" +
                    "3. Do this\n" +
                    "4. Do this\n" +
                    "5. Do this"
        ),
        Recipe(
            "Nachos",
            R.drawable.nachos,
            listOf(
                Ingredient("Red onion", 0.25, "", "vegetable"),
                Ingredient("Tomato", 1.0, "", "vegetable"),
                Ingredient("Cucumber", 0.5, "", "vegetable"),
                Ingredient("Corn", 90.0, "g", "canned"),
                Ingredient("Beans", 380.0, "g", "canned"),
                Ingredient("Veggie meat", 325.0, "g", "frozen"),
                Ingredient("Sour cream", 1.0, "dl", "dairy"),
                Ingredient("Cheese", 30.0, "g", "dairy"),
                Ingredient("Salsa", 125.0, "g", "mexican"),
                Ingredient("Nacho chips", 237.5, "g", "mexican"),
                Ingredient("Cumin", 2.0, "tsp", "spice"),
                Ingredient("Garlic powder", 1.0, "tsp", "spice"),
                Ingredient("Oregano", 1.0, "tsp", "spice"),
                Ingredient("Paprika", 1.0, "tsp", "spice"),
                Ingredient("Salt", 2.0, "tsp", "baking"),
                Ingredient("Olive oil", 2.0, "tbsp", "oil")
            ),
            "1. Do this \n" +
                    "2. Do this \n" +
                    "3. Do this\n" +
                    "4. Do this\n" +
                    "5. Do this"
        ),
        Recipe(
            "Tacos",
            R.drawable.tacos,
            listOf(
                Ingredient("Red onion", 0.25, "", "vegetable"),
                Ingredient("Tomato", 1.0, "", "vegetable"),
                Ingredient("Cucumber", 0.5, "", "vegetable"),
                Ingredient("Corn", 90.0, "g", "canned"),
                Ingredient("Beans", 380.0, "g", "canned"),
                Ingredient("Veggie meat", 325.0, "g", "frozen"),
                Ingredient("Sour cream", 1.0, "dl", "dairy"),
                Ingredient("Cheese", 30.0, "g", "dairy"),
                Ingredient("Salsa", 125.0, "g", "mexican"),
                Ingredient("Tortilla", 160.0, "g", "mexican"),
                Ingredient("Cumin", 2.0, "tsp", "spice"),
                Ingredient("Garlic powder", 1.0, "tsp", "spice"),
                Ingredient("Oregano", 1.0, "tsp", "spice"),
                Ingredient("Paprika", 1.0, "tsp", "spice"),
                Ingredient("Salt", 2.0, "tsp", "baking"),
                Ingredient("Olive oil", 2.0, "tbsp", "oil")
            ),
            "1. Do this \n" +
                    "2. Do this \n" +
                    "3. Do this\n" +
                    "4. Do this\n" +
                    "5. Do this"
        ),
        Recipe(
            "Quesadilla",
            R.drawable.quesadilla,
            listOf(
                Ingredient("Onion", 1.0, "", "vegetable"),
                Ingredient("Red bell pepper", 1.0, "", "vegetable"),
                Ingredient("Cabbage", 300.0, "g", "vegetable"),
                Ingredient("Corn", 180.0, "g", "canned"),
                Ingredient("Spinach", 250.0, "g", "frozen"),
                Ingredient("Beans", 380.0, "g", "canned"),
                Ingredient("Veggie meat", 325.0, "g", "frozen"),
                Ingredient("Sour cream", 2.0, "dl", "dairy"),
                Ingredient("Cheese", 30.0, "g", "dairy"),
                Ingredient("Tortilla", 160.0, "g", "mexican"),
                Ingredient("Salsa", 125.0, "g", "mexican"),
                Ingredient("Cumin", 2.0, "tsp", "spice"),
                Ingredient("Garlic powder", 1.0, "tsp", "spice"),
                Ingredient("Oregano", 1.0, "tsp", "spice"),
                Ingredient("Paprika", 1.0, "tsp", "spice"),
                Ingredient("Salt", 2.0, "tsp", "baking"),
                Ingredient("Olive oil", 2.0, "tbsp", "oil")
            ),
            "1. Do this \n" +
                    "2. Do this \n" +
                    "3. Do this\n" +
                    "4. Do this\n" +
                    "5. Do this"
        ),
        Recipe(
            "Chili sin Carne",
            R.drawable.chili_sin_carne,
            listOf(
                Ingredient("Onion", 1.0, "", "vegetable"),
                Ingredient("Garlic", 1.0, "cloves of", "vegetable"),
                Ingredient("Yellow bell pepper", 1.0, "", "vegetable"),
                Ingredient("Crushed tomatoes", 390.0, "g", "canned"),
                Ingredient("Beans", 380.0, "g", "canned"),
                Ingredient("Rice", 2.0, "dl", "rice"),
                Ingredient("Veggie meat", 325.0, "g", "frozen"),
                Ingredient("Cumin", 2.0, "tsp", "spice"),
                Ingredient("Paprika", 2.0, "tsp", "spice"),
                Ingredient("Parsley", 1.0, "tbsp", "spice"),
                Ingredient("Black pepper", 1.0, "tsp", "spice"),
                Ingredient("Salt", 2.0, "tsp", "baking"),
                Ingredient("Olive oil", 2.0, "tbsp", "oil")
            ),
            "1. Do this \n" +
                    "2. Do this \n" +
                    "3. Do this\n" +
                    "4. Do this\n" +
                    "5. Do this"
        ),
        Recipe(
            "Chickpea Salad",
            R.drawable.chickpea_salad,
            listOf(
                Ingredient("Romaine lettuce", 90.0, "g", "vegetable"),
                Ingredient("Tomato", 1.0, "", "vegetable"),
                Ingredient("Cucumber", 0.5, "", "vegetable"),
                Ingredient("Avocado", 2.0, "", "vegetable"),
                Ingredient("Carrot", 1.0, "", "vegetable"),
                Ingredient("Fusilli", 250.0, "g", "pasta"),
                Ingredient("Chickpeas", 600.0, "g", "canned"),
                Ingredient("Feta cheese", 150.0, "g", "dairy"),
                Ingredient("Garlic powder", 1.0, "tsp", "spice"),
                Ingredient("Paprika", 2.0, "tsp", "spice"),
                Ingredient("Salt", 2.0, "tsp", "spice"),
                Ingredient("Olive oil", 2.0, "tbsp", "oil")
            ),
            "1. Do this \n" +
                    "2. Do this \n" +
                    "3. Do this\n" +
                    "4. Do this\n" +
                    "5. Do this"
        ),
        Recipe(
            "Meatballs and boiled Potatoes",
            R.drawable.meatballs_and_boiled_potatoes,
            listOf(
                Ingredient("Tomato", 1.0, "", "vegetable"),
                Ingredient("Cucumber", 0.5, "", "vegetable"),
                Ingredient("Potatoes", 6.0, "", "vegetable"),
                Ingredient("Sour cream", 2.0, "dl", "dairy"),
                Ingredient("Meatballs", 480.0, "g", "frozen"),
                Ingredient("Salt", 2.0, "tsp", "baking"),
                Ingredient("Olive oil", 2.0, "tbsp", "oil")
            ),
            "1. Do this \n" +
                    "2. Do this \n" +
                    "3. Do this\n" +
                    "4. Do this\n" +
                    "5. Do this"
        ),
        Recipe(
            "Stroganoff",
            R.drawable.stroganoff,
            listOf(
                Ingredient("Onion", 1.0, "", "vegetable"),
                Ingredient("Falu sausage", 500.0, "g", "meat"),
                Ingredient("Heavy cream", 2.5, "dl", "dairy"),
                Ingredient("Tomato paste", 3.0, "tbsp", "canned"),
                Ingredient("Soy sauce", 1.0, "tbsp", "asian"),
                Ingredient("Rice", 2.0, "dl", "rice"),
                Ingredient("Black pepper", 1.0, "tsp", "spice"),
                Ingredient("Salt", 2.0, "tsp", "baking"),
                Ingredient("Olive oil", 2.0, "tbsp", "oil")
            ),
            "1. Do this \n" +
                    "2. Do this \n" +
                    "3. Do this\n" +
                    "4. Do this\n" +
                    "5. Do this"
        ),
        Recipe(
            "Chickpea Paprikash",
            R.drawable.chickpea_paprikash,
            listOf(
                Ingredient("Onion", 1.0, "", "vegetable"),
                Ingredient("Tomato", 2.0, "", "vegetable"),
                Ingredient("Red bell pepper", 1.0, "", "vegetable"),
                Ingredient("Chickpeas", 400.0, "g", "canned"),
                Ingredient("Sour cream", 2.0, "dl", "dairy"),
                Ingredient("Flour", 2.0, "tbsp", "baking"),
                Ingredient("Farfalle", 350.0, "g", "pasta"),
                Ingredient("Paprika", 8.0, "tsp", "spice"),
                Ingredient("Black pepper", 1.0, "tsp", "spice"),
                Ingredient("Salt", 2.0, "tsp", "baking"),
                Ingredient("Olive oil", 2.0, "tbsp", "oil")
            ),
            "1. Do this \n" +
                    "2. Do this \n" +
                    "3. Do this\n" +
                    "4. Do this\n" +
                    "5. Do this"
        ),
        Recipe(
            "Chicken Paprikash",
            R.drawable.chicken_paprikash,
            listOf(
                Ingredient("Onion", 1.0, "", "vegetable"),
                Ingredient("Tomato", 2.0, "", "vegetable"),
                Ingredient("Red bell pepper", 1.0, "", "vegetable"),
                Ingredient("Chicken fillets", 300.0, "g", "frozen"),
                Ingredient("Sour cream", 2.0, "dl", "dairy"),
                Ingredient("Flour", 2.0, "tbsp", "baking"),
                Ingredient("Farfalle", 350.0, "g", "pasta"),
                Ingredient("Paprika", 8.0, "tsp", "spice"),
                Ingredient("Black pepper", 1.0, "tsp", "spice"),
                Ingredient("Salt", 2.0, "tsp", "baking"),
                Ingredient("Olive oil", 2.0, "tbsp", "oil")
            ),
            "1. Do this \n" +
                    "2. Do this \n" +
                    "3. Do this\n" +
                    "4. Do this\n" +
                    "5. Do this"
        ),
        Recipe(
            "Spaghetti Bolognese",
            R.drawable.spaghetti_bolognese,
            listOf(
                Ingredient("Veggie meat", 300.0, "g", "frozen"),
                Ingredient("Pasta sauce", 400.0, "g", "pasta"),
                Ingredient("Spaghetti", 350.0, "g", "pasta"),
                Ingredient("Cheese", 30.0, "g", "dairy"),
                Ingredient("Ketchup", 4.0, "tbsp", "condiment"),
                Ingredient("Black pepper", 1.0, "tsp", "spice"),
                Ingredient("Salt", 2.0, "tsp", "baking"),
                Ingredient("Olive oil", 2.0, "tbsp", "oil")
            ),
            "1. Do this \n" +
                    "2. Do this \n" +
                    "3. Do this\n" +
                    "4. Do this\n" +
                    "5. Do this"
        ),
        Recipe(
            "Tagliatelle with Pesto",
            R.drawable.tagliatelle_with_pesto,
            listOf(
                Ingredient("Carrot", 2.0, "", "vegetable"),
                Ingredient("Broccoli", 1.0, "", "vegetable"),
                Ingredient("Zucchini", 1.0, "", "vegetable"),
                Ingredient("Tagliatelle", 350.0, "g", "pasta"),
                Ingredient("Pesto", 190.0, "g", "pasta"),
                Ingredient("Black pepper", 1.0, "tsp", "spice"),
                Ingredient("Salt", 2.0, "tsp", "baking"),
                Ingredient("Olive oil", 2.0, "tbsp", "oil")
            ),
            "1. Do this \n" +
                    "2. Do this \n" +
                    "3. Do this\n" +
                    "4. Do this\n" +
                    "5. Do this"
        ),
        Recipe(
            "Veggie burger with Fries",
            R.drawable.veggie_burger_and_fries,
            listOf(
                Ingredient("Red onion", 0.25, "", "vegetable"),
                Ingredient("Tomato", 1.0, "", "vegetable"),
                Ingredient("Romaine lettuce", 40.0, "g", "vegetable"),
                Ingredient("Hamburger buns", 4.0, "", "bread"),
                Ingredient("Veggie patties", 4.0, "", "frozen"),
                Ingredient("Fries", 0.5, "kg", "frozen"),
                Ingredient("Ketchup", 4.0, "tbsp", "condiment"),
                Ingredient("Mustard", 4.0, "tbsp", "condiment"),
                Ingredient("Hamburger dressing", 4.0, "tbsp", "condiment"),
                Ingredient("Garlic powder", 1.0, "tsp", "spice"),
                Ingredient("Paprika", 1.0, "tsp", "spice"),
                Ingredient("Black pepper", 1.0, "tsp", "spice"),
                Ingredient("Salt", 2.0, "tsp", "baking"),
                Ingredient("Olive oil", 2.0, "tbsp", "oil")
            ),
            "1. Do this \n" +
                    "2. Do this \n" +
                    "3. Do this\n" +
                    "4. Do this\n" +
                    "5. Do this"
        )
    )

}
