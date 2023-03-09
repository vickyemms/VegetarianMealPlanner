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
                Ingredient("Onion", 1.0, ""),
                Ingredient("Garlic", 3.0, "cloves of"),
                Ingredient("Ginger", 25.0, "g"),
                Ingredient("Carrot", 2.0, ""),
                Ingredient("Chili pepper", 0.5, ""),
                Ingredient("Tomato", 3.0, ""),
                Ingredient("Lime", 1.0, ""),
                Ingredient("Coconut milk", 1.0, "dl"),
                Ingredient("Red lentils", 3.0, "dl"),
                Ingredient("Cumin", 1.0, "tsp"),
                Ingredient("Garam masala", 1.0, "tsp"),
                Ingredient("Turmeric", 1.0, "tsp"),
                Ingredient("Salt", 2.0, "tsp"),
                Ingredient("Black pepper", 1.0, "tsp"),
                Ingredient("Olive oil", 2.0, "tbsp"),
            ),
            "1. Do this \n" +
                    "2. Do this \n" +
                    "3. Do this\n" +
                    "4. Do this\n" +
                    "5. Do this"
        ),
        Recipe(
            "Chickpea Curry",
            R.drawable.chickpea_curry,
            listOf(
                Ingredient("Red onion", 1.0, ""),
                Ingredient("Garlic", 2.0, "cloves of"),
                Ingredient("Ginger", 20.0, "g"),
                Ingredient("Chili pepper", 0.5, ""),
                Ingredient("Crushed tomatoes", 390.0, "g"),
                Ingredient("Coconut milk", 1.0, "dl"),
                Ingredient("Chickpeas", 400.0, "g"),
                Ingredient("Spinache", 125.0, "g"),
                Ingredient("Cumin", 1.0, "tsp"),
                Ingredient("Garam masala", 1.0, "tsp"),
                Ingredient("Turmeric", 1.0, "tsp"),
                Ingredient("Paprika", 1.0, "tsp"),
                Ingredient("Salt", 2.0, "tsp"),
                Ingredient("Olive oil", 2.0, "tbsp")
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
                Ingredient("Frozen vegetables", 450.0, "g"),
                Ingredient("Tofu", 400.0, "g"),
                Ingredient("Rice", 2.0, "dl"),
                Ingredient("Soy sauce", 2.0, "tbsp"),
                Ingredient("Lemon pepper", 1.0, "tsp"),
                Ingredient("Salt", 1.0, "tsp"),
                Ingredient("Olive oil", 2.0, "tbsp")
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
                Ingredient("Frozen vegetables", 450.0, "g"),
                Ingredient("Tofu", 400.0, "g"),
                Ingredient("Noodles", 200.0, "g"),
                Ingredient("Soy sauce", 2.0, "tbsp"),
                Ingredient("Lemon pepper", 1.0, "tsp"),
                Ingredient("Salt", 1.0, "tsp"),
                Ingredient("Olive oil", 2.0, "tbsp")
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
                Ingredient("Red onion", 0.25, ""),
                Ingredient("Tomato", 1.0, ""),
                Ingredient("Cucumber", 0.5, ""),
                Ingredient("Corn", 90.0, "g"),
                Ingredient("Beans", 380.0, "g"),
                Ingredient("Veggie meat", 325.0, "g"),
                Ingredient("Sour cream", 1.0, "dl"),
                Ingredient("Cheese", 30.0, "g"),
                Ingredient("Salsa", 125.0, "g"),
                Ingredient("Nacho chips", 237.5, "g"),
                Ingredient("Cumin", 2.0, "tsp"),
                Ingredient("Garlic powder", 1.0, "tsp"),
                Ingredient("Oregano", 1.0, "tsp"),
                Ingredient("Paprika", 1.0, "tsp"),
                Ingredient("Salt", 2.0, "tsp"),
                Ingredient("Olive oil", 2.0, "tbsp")
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
                Ingredient("Red onion", 0.25, ""),
                Ingredient("Tomato", 1.0, ""),
                Ingredient("Cucumber", 0.5, ""),
                Ingredient("Corn", 90.0, "g"),
                Ingredient("Beans", 380.0, "g"),
                Ingredient("Veggie meat", 325.0, "g"),
                Ingredient("Sour cream", 1.0, "dl"),
                Ingredient("Cheese", 30.0, "g"),
                Ingredient("Salsa", 125.0, "g"),
                Ingredient("Tortilla", 160.0, "g"),
                Ingredient("Cumin", 2.0, "tsp"),
                Ingredient("Garlic powder", 1.0, "tsp"),
                Ingredient("Oregano", 1.0, "tsp"),
                Ingredient("Paprika", 1.0, "tsp"),
                Ingredient("Salt", 2.0, "tsp"),
                Ingredient("Olive oil", 2.0, "tbsp")
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
                Ingredient("Onion", 1.0, ""),
                Ingredient("Red bell pepper", 1.0, ""),
                Ingredient("Cabbage", 300.0, "g"),
                Ingredient("Corn", 180.0, "g"),
                Ingredient("Spinach", 250.0, "g"),
                Ingredient("Beans", 380.0, "g"),
                Ingredient("Veggie meat", 325.0, "g"),
                Ingredient("Sour cream", 2.0, "dl"),
                Ingredient("Cheese", 30.0, "g"),
                Ingredient("Tortilla", 160.0, "g"),
                Ingredient("Salsa", 125.0, "g"),
                Ingredient("Cumin", 2.0, "tsp"),
                Ingredient("Garlic powder", 1.0, "tsp"),
                Ingredient("Oregano", 1.0, "tsp"),
                Ingredient("Paprika", 1.0, "tsp"),
                Ingredient("Salt", 2.0, "tsp"),
                Ingredient("Olive oil", 2.0, "tbsp")
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
                Ingredient("Onion", 1.0, ""),
                Ingredient("Garlic", 1.0, "cloves of"),
                Ingredient("Yellow bell pepper", 1.0, ""),
                Ingredient("Crushed tomatoes", 390.0, "g"),
                Ingredient("Beans", 380.0, "g"),
                Ingredient("Rice", 2.0, "dl"),
                Ingredient("Veggie meat", 325.0, "g"),
                Ingredient("Cumin", 2.0, "tsp"),
                Ingredient("Paprika", 2.0, "tsp"),
                Ingredient("Parsley", 1.0, "tbsp"),
                Ingredient("Black pepper", 1.0, "tsp"),
                Ingredient("Salt", 2.0, "tsp"),
                Ingredient("Olive oil", 2.0, "tbsp")
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
                Ingredient("Romaine lettuce", 90.0, "g"),
                Ingredient("Tomato", 1.0, ""),
                Ingredient("Cucumber", 0.5, ""),
                Ingredient("Avocado", 2.0, ""),
                Ingredient("Carrot", 1.0, ""),
                Ingredient("Fusilli", 250.0, "g"),
                Ingredient("Chickpeas", 600.0, "g"),
                Ingredient("Feta cheese", 150.0, "g"),
                Ingredient("Garlic powder", 1.0, "tsp"),
                Ingredient("Paprika", 2.0, "tsp"),
                Ingredient("Salt", 2.0, "tsp"),
                Ingredient("Olive oil", 2.0, "tbsp")
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
                Ingredient("Tomato", 1.0, ""),
                Ingredient("Cucumber", 0.5, ""),
                Ingredient("Potatoes", 6.0, ""),
                Ingredient("Sour cream", 2.0, "dl"),
                Ingredient("Meatballs", 480.0, "g"),
                Ingredient("Salt", 2.0, "tsp"),
                Ingredient("Olive oil", 2.0, "tbsp")
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
                Ingredient("Onion", 1.0, ""),
                Ingredient("Falu sausage", 500.0, "g"),
                Ingredient("Heavy cream", 2.5, "dl"),
                Ingredient("Tomato paste", 3.0, "tbsp"),
                Ingredient("Soy sauce", 1.0, "tbsp"),
                Ingredient("Rice", 2.0, "dl"),
                Ingredient("Black pepper", 1.0, "tsp"),
                Ingredient("Salt", 2.0, "tsp"),
                Ingredient("Olive oil", 2.0, "tbsp")
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
                Ingredient("Onion", 1.0, ""),
                Ingredient("Tomato", 2.0, ""),
                Ingredient("Red bell pepper", 1.0, ""),
                Ingredient("Chickpeas", 400.0, "g"),
                Ingredient("Sour cream", 2.0, "dl"),
                Ingredient("Flour", 2.0, "tbsp"),
                Ingredient("Farfalle", 350.0, "g"),
                Ingredient("Paprika", 8.0, "tsp"),
                Ingredient("Black pepper", 1.0, "tsp"),
                Ingredient("Salt", 2.0, "tsp"),
                Ingredient("Olive oil", 2.0, "tbsp")
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
                Ingredient("Onion", 1.0, ""),
                Ingredient("Tomato", 2.0, ""),
                Ingredient("Red bell pepper", 1.0, ""),
                Ingredient("Chicken fillets", 100.0, "g"),
                Ingredient("Sour cream", 2.0, "dl"),
                Ingredient("Flour", 2.0, "tbsp"),
                Ingredient("Farfalle", 350.0, "g"),
                Ingredient("Paprika", 8.0, "tsp"),
                Ingredient("Black pepper", 1.0, "tsp"),
                Ingredient("Salt", 2.0, "tsp"),
                Ingredient("Olive oil", 2.0, "tbsp")
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
                Ingredient("Veggie meat", 300.0, "g"),
                Ingredient("Pasta sauce", 400.0, "g"),
                Ingredient("Spaghetti", 350.0, "g"),
                Ingredient("Cheese", 30.0, "g"),
                Ingredient("Ketchup", 4.0, "tbsp"),
                Ingredient("Black pepper", 1.0, "tsp"),
                Ingredient("Salt", 2.0, "tsp"),
                Ingredient("Olive oil", 2.0, "tbsp")
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
                Ingredient("Carrot", 2.0, ""),
                Ingredient("Broccoli", 1.0, ""),
                Ingredient("Zucchini", 1.0, ""),
                Ingredient("Tagliatelle", 350.0, "g"),
                Ingredient("Pesto", 190.0, "g"),
                Ingredient("Black pepper", 1.0, "tsp"),
                Ingredient("Salt", 2.0, "tsp"),
                Ingredient("Olive oil", 2.0, "tbsp")
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
                Ingredient("Red onion", 0.25, ""),
                Ingredient("Tomato", 1.0, ""),
                Ingredient("Romaine lettuce", 40.0, "g"),
                Ingredient("Hamburger buns", 4.0, ""),
                Ingredient("Veggie patties", 4.0, ""),
                Ingredient("Fries", 0.5, "kg"),
                Ingredient("Ketchup", 4.0, "tbsp"),
                Ingredient("Mustard", 4.0, "tbsp"),
                Ingredient("Hamburger dressing", 4.0, "tbsp"),
                Ingredient("Garlic powder", 1.0, "tsp"),
                Ingredient("Paprika", 1.0, "tsp"),
                Ingredient("Black pepper", 1.0, "tsp"),
                Ingredient("Salt", 2.0, "tsp"),
                Ingredient("Olive oil", 2.0, "tbsp")
            ),
            "1. Do this \n" +
                    "2. Do this \n" +
                    "3. Do this\n" +
                    "4. Do this\n" +
                    "5. Do this"
        )
    )

}
