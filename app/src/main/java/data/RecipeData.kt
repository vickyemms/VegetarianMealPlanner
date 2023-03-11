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
                Ingredient("Onion", 1.0, "", "vegetable", false),
                Ingredient("Garlic", 3.0, "cloves of", "vegetable", false),
                Ingredient("Ginger", 25.0, "g", "vegetable", false),
                Ingredient("Carrot", 2.0, "", "vegetable", false),
                Ingredient("Chili pepper", 0.5, "", "vegetable", false),
                Ingredient("Tomato", 3.0, "", "vegetable", false),
                Ingredient("Lime", 1.0, "", "fruit", false),
                Ingredient("Coconut milk", 1.0, "dl", "asian", false),
                Ingredient("Red lentils", 3.0, "dl", "canned", false),
                Ingredient("Rice", 2.0, "dl", "rice", true),
                Ingredient("Cumin", 1.0, "tsp", "spice", true),
                Ingredient("Garam masala", 1.0, "tsp", "spice", true),
                Ingredient("Turmeric", 1.0, "tsp", "spice", true),
                Ingredient("Salt", 2.0, "tsp", "baking", true),
                Ingredient("Black pepper", 1.0, "tsp", "spice", true),
                Ingredient("Olive oil", 2.0, "tbsp", "oil", true),
            ),
            "1. Heat up olive oil and start cooking the rice. \n" +
                    "2. Cut and chop the onion, garlic, ginger, carrots, chili pepper and tomatoes. \n" +
                    "3. Add the onions and cook until tender for about 2-3 minutes.\n" +
                    "4. Add the garlic, ginger, carrots, chili pepper, cumin, garam masala and turmeric and cook for about 3-4 minutes.\n" +
                    "5. Heat up 6 dl of water and add the red lentils and the water. Let it cook for about 20 minutes. Add salt and black pepper. \n" +
                    "6. Add the chopped tomatoes and coconut milk. Squeeze half a lime to the mix. Let it simmer for 10 minutes.\n" +
                    "7. Serve with the cooked rice."
        ),
        Recipe(
            "Chickpea Curry",
            R.drawable.chickpea_curry,
            listOf(
                Ingredient("Red onion", 1.0, "", "vegetable", false),
                Ingredient("Garlic", 2.0, "cloves of", "vegetable", false),
                Ingredient("Ginger", 20.0, "g", "vegetable", false),
                Ingredient("Chili pepper", 0.5, "", "vegetable", false),
                Ingredient("Crushed tomatoes", 390.0, "g", "canned", false),
                Ingredient("Coconut milk", 1.0, "dl", "asian", false),
                Ingredient("Chickpeas", 400.0, "g", "canned", false),
                Ingredient("Spinache", 125.0, "g", "frozen", false),
                Ingredient("Cumin", 1.0, "tsp", "spice", true),
                Ingredient("Garam masala", 1.0, "tsp", "spice", true),
                Ingredient("Turmeric", 1.0, "tsp", "spice", true),
                Ingredient("Paprika", 1.0, "tsp", "spice", true),
                Ingredient("Salt", 2.0, "tsp", "baking", true),
                Ingredient("Olive oil", 2.0, "tbsp", "oil", true)
            ),
            "1. Heat up olive oil and start cooking the rice.  \n" +
                    "2. Cut and chop the red onion, garlic, ginger, and chili pepper. \n" +
                    "3. Add the onions and cook until tender for about 2-3 minutes.\n" +
                    "4. Add the garlic, ginger, chili pepper, cumin, garam masala, turmeric and paprika and cook for about 3-4 minutes.\n" +
                    "5. Add the crushed tomatoes, coconut milk and chickpeas and cook for about 7 minutes. \n" +
                    "6. Salt to taste.\n" +
                    "7. Serve with rice."
        ),
        Recipe(
            "Fried Rice with Tofu",
            R.drawable.fried_rice_tofu,
            listOf(
                Ingredient("Frozen vegetables", 450.0, "g", "frozen", false),
                Ingredient("Tofu", 400.0, "g", "vegetarian", false),
                Ingredient("Rice", 2.0, "dl", "rice", true),
                Ingredient("Soy sauce", 2.0, "tbsp", "asian", true),
                Ingredient("Lemon pepper", 1.0, "tsp", "spice", true),
                Ingredient("Salt", 1.0, "tsp", "baking", true),
                Ingredient("Olive oil", 2.0, "tbsp", "oil", true)
            ),
            "1. Heat up olive oil and start cooking the rice. \n" +
                    "2. Cut up the tofu. \n" +
                    "3. Add the frozen vegetables, tofu, lemon pepper and salt.\n" +
                    "4. Add the rice and soy sauce when it's done cooking and mix it add together.\n" +
                    "5. Serve."
        ),
        Recipe(
            "Noodle Stir Fry with Tofu",
            R.drawable.noodle_stir_fry,
            listOf(
                Ingredient("Frozen vegetables", 450.0, "g", "frozen", false),
                Ingredient("Tofu", 400.0, "g", "vegetarian", false),
                Ingredient("Noodles", 200.0, "g", "asian", false),
                Ingredient("Soy sauce", 2.0, "tbsp", "asian", true),
                Ingredient("Lemon pepper", 1.0, "tsp", "spice", true),
                Ingredient("Salt", 1.0, "tsp", "baking", true),
                Ingredient("Olive oil", 2.0, "tbsp", "oil", true)
            ),
            "1. Heat up olive oil and start cooking the noodles. \n" +
                    "2. Cut up the tofu. \n" +
                    "3. Add the frozen vegetables, tofu, lemon pepper and salt.\n" +
                    "4. Add the noodles and soy sauce when it's done cooking and mix it add together.\n" +
                    "5. Serve."
        ),
        Recipe(
            "Nachos",
            R.drawable.nachos,
            listOf(
                Ingredient("Red onion", 0.25, "", "vegetable", false),
                Ingredient("Tomato", 1.0, "", "vegetable", false),
                Ingredient("Cucumber", 0.5, "", "vegetable", false),
                Ingredient("Corn", 90.0, "g", "canned", false),
                Ingredient("Beans", 380.0, "g", "canned", false),
                Ingredient("Veggie meat", 325.0, "g", "frozen", false),
                Ingredient("Sour cream", 1.0, "dl", "dairy", false),
                Ingredient("Cheese", 30.0, "g", "dairy", false),
                Ingredient("Salsa", 125.0, "g", "mexican", false),
                Ingredient("Nacho chips", 237.5, "g", "mexican", false),
                Ingredient("Cumin", 2.0, "tsp", "spice", true),
                Ingredient("Garlic powder", 1.0, "tsp", "spice", true),
                Ingredient("Oregano", 1.0, "tsp", "spice", true),
                Ingredient("Paprika", 1.0, "tsp", "spice", true),
                Ingredient("Salt", 2.0, "tsp", "baking", true),
                Ingredient("Olive oil", 2.0, "tbsp", "oil", true)
            ),
            "1. Heat up the olive oil and chop the red onion, tomato and cucumber. \n" +
                    "2. Add the veggie meat, beans, cumin, garlic powder, oregano, paprika and salt. Let cook for about 8 minutes. \n" +
                    "3. Add nacho chips to a plate and put the veggie meat on the chips. Sprinkle cheese on top.\n" +
                    "4. Add the cut up vegetables, corn, sour cream and salsa to the nachos.\n" +
                    "5. Serve."
        ),
        Recipe(
            "Tacos",
            R.drawable.tacos,
            listOf(
                Ingredient("Red onion", 0.25, "", "vegetable", false),
                Ingredient("Tomato", 1.0, "", "vegetable", false),
                Ingredient("Cucumber", 0.5, "", "vegetable", false),
                Ingredient("Corn", 90.0, "g", "canned", false),
                Ingredient("Beans", 380.0, "g", "canned", false),
                Ingredient("Veggie meat", 325.0, "g", "frozen", false),
                Ingredient("Sour cream", 1.0, "dl", "dairy", false),
                Ingredient("Cheese", 30.0, "g", "dairy", false),
                Ingredient("Salsa", 125.0, "g", "mexican", false),
                Ingredient("Tortilla", 160.0, "g", "mexican", false),
                Ingredient("Cumin", 2.0, "tsp", "spice", true),
                Ingredient("Garlic powder", 1.0, "tsp", "spice", true),
                Ingredient("Oregano", 1.0, "tsp", "spice", true),
                Ingredient("Paprika", 1.0, "tsp", "spice", true),
                Ingredient("Salt", 2.0, "tsp", "baking", true),
                Ingredient("Olive oil", 2.0, "tbsp", "oil", true)
            ),
            "1. Heat up the olive oil and chop the red onion, tomato and cucumber. \n" +
                    "2. Add the veggie meat, beans, cumin, garlic powder, oregano, paprika and salt. Let cook for about 8 minutes. \n" +
                    "3. Add tortilla to a plate and put the veggie meat on it. Sprinkle cheese on top.\n" +
                    "4. Add the cut up vegetables, corn, sour cream and salsa to the tortilla and roll it up.\n" +
                    "5. Serve."
        ),
        Recipe(
            "Quesadilla",
            R.drawable.quesadilla,
            listOf(
                Ingredient("Onion", 1.0, "", "vegetable", false),
                Ingredient("Red bell pepper", 1.0, "", "vegetable", false),
                Ingredient("Cabbage", 300.0, "g", "vegetable", false),
                Ingredient("Corn", 180.0, "g", "canned", false),
                Ingredient("Spinach", 250.0, "g", "frozen", false),
                Ingredient("Beans", 380.0, "g", "canned", false),
                Ingredient("Veggie meat", 325.0, "g", "frozen", false),
                Ingredient("Sour cream", 2.0, "dl", "dairy", false),
                Ingredient("Cheese", 30.0, "g", "dairy", false),
                Ingredient("Tortilla", 160.0, "g", "mexican", false),
                Ingredient("Salsa", 125.0, "g", "mexican", false),
                Ingredient("Cumin", 2.0, "tsp", "spice", true),
                Ingredient("Garlic powder", 1.0, "tsp", "spice", true),
                Ingredient("Oregano", 1.0, "tsp", "spice", true),
                Ingredient("Paprika", 1.0, "tsp", "spice", true),
                Ingredient("Salt", 2.0, "tsp", "baking", true),
                Ingredient("Olive oil", 2.0, "tbsp", "oil", true)
            ),
            "1. Heat up the olive oil and chop the onion, red bell pepper and cabbage. \n" +
                    "2. Add the onions and cook until tender for about 2-3 minutes. \n" +
                    "3. Add the red bell pepper and cabbage and cook 2 more minutes.\n" +
                    "4. Add the corn, beans, spinach, cumin, garlic powder, oregano, paprika and salt. Cook until soft.\n" +
                    "5. Add the sour cream and cheese and mix together.\n" +
                    "6. Add the mix to a tortilla, fold it and put it in the oven 8 minutes on each side.\n" +
                    "7. Serve with salsa on top."
        ),
        Recipe(
            "Chili sin Carne",
            R.drawable.chili_sin_carne,
            listOf(
                Ingredient("Onion", 1.0, "", "vegetable", false),
                Ingredient("Garlic", 1.0, "cloves of", "vegetable", false),
                Ingredient("Yellow bell pepper", 1.0, "", "vegetable", false),
                Ingredient("Crushed tomatoes", 390.0, "g", "canned", false),
                Ingredient("Beans", 380.0, "g", "canned", false),
                Ingredient("Rice", 2.0, "dl", "rice", true),
                Ingredient("Veggie meat", 325.0, "g", "frozen", false),
                Ingredient("Cumin", 2.0, "tsp", "spice", true),
                Ingredient("Paprika", 2.0, "tsp", "spice", true),
                Ingredient("Parsley", 1.0, "tbsp", "spice", true),
                Ingredient("Black pepper", 1.0, "tsp", "spice", true),
                Ingredient("Salt", 2.0, "tsp", "baking", true),
                Ingredient("Olive oil", 2.0, "tbsp", "oil", true)
            ),
            "1. Heat up the olive oil and start cooking the rice. \n" +
                    "2. Cut up the onion, garlic and yellow bell pepper. Add it to the pan and cook for about 2-3 minutes. \n" +
                    "3. Add the veggie meat, beans, cumin, paprika, black pepper and salt to the mix and cook for about 5 minutes.\n" +
                    "4. Add the crushed tomatoes and let simmer for about 5 minutes.\n" +
                    "5. Add parsley and serve with rice."
        ),
        Recipe(
            "Chickpea Salad",
            R.drawable.chickpea_salad,
            listOf(
                Ingredient("Romaine lettuce", 90.0, "g", "vegetable", false),
                Ingredient("Tomato", 1.0, "", "vegetable", false),
                Ingredient("Cucumber", 0.5, "", "vegetable", false),
                Ingredient("Avocado", 2.0, "", "vegetable", false),
                Ingredient("Carrot", 1.0, "", "vegetable", false),
                Ingredient("Fusilli", 250.0, "g", "pasta", false),
                Ingredient("Chickpeas", 600.0, "g", "canned", false),
                Ingredient("Feta cheese", 150.0, "g", "dairy", false),
                Ingredient("Garlic powder", 1.0, "tsp", "spice", true),
                Ingredient("Paprika", 2.0, "tsp", "spice", true),
                Ingredient("Salt", 2.0, "tsp", "spice", true),
                Ingredient("Olive oil", 2.0, "tbsp", "oil", true)
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
                Ingredient("Tomato", 1.0, "", "vegetable", false),
                Ingredient("Cucumber", 0.5, "", "vegetable", false),
                Ingredient("Potatoes", 6.0, "", "vegetable", false),
                Ingredient("Sour cream", 2.0, "dl", "dairy", false),
                Ingredient("Meatballs", 480.0, "g", "frozen", false),
                Ingredient("Salt", 2.0, "tsp", "baking", true),
                Ingredient("Olive oil", 2.0, "tbsp", "oil", true)
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
                Ingredient("Onion", 1.0, "", "vegetable", false),
                Ingredient("Falu sausage", 500.0, "g", "meat", false),
                Ingredient("Heavy cream", 2.5, "dl", "dairy", false),
                Ingredient("Tomato paste", 3.0, "tbsp", "canned", true),
                Ingredient("Soy sauce", 1.0, "tbsp", "asian", true),
                Ingredient("Rice", 2.0, "dl", "rice", true),
                Ingredient("Black pepper", 1.0, "tsp", "spice", true),
                Ingredient("Salt", 2.0, "tsp", "baking", true),
                Ingredient("Olive oil", 2.0, "tbsp", "oil", true)
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
                Ingredient("Onion", 1.0, "", "vegetable", false),
                Ingredient("Tomato", 2.0, "", "vegetable", false),
                Ingredient("Red bell pepper", 1.0, "", "vegetable", false),
                Ingredient("Chickpeas", 400.0, "g", "canned", false),
                Ingredient("Sour cream", 2.0, "dl", "dairy", false),
                Ingredient("Flour", 2.0, "tbsp", "baking", true),
                Ingredient("Farfalle", 350.0, "g", "pasta", false),
                Ingredient("Paprika", 8.0, "tsp", "spice", true),
                Ingredient("Black pepper", 1.0, "tsp", "spice", true),
                Ingredient("Salt", 2.0, "tsp", "baking", true),
                Ingredient("Olive oil", 2.0, "tbsp", "oil", true)
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
                Ingredient("Onion", 1.0, "", "vegetable", false),
                Ingredient("Tomato", 2.0, "", "vegetable", false),
                Ingredient("Red bell pepper", 1.0, "", "vegetable", false),
                Ingredient("Chicken fillets", 300.0, "g", "frozen", false),
                Ingredient("Sour cream", 2.0, "dl", "dairy", false),
                Ingredient("Flour", 2.0, "tbsp", "baking", true),
                Ingredient("Farfalle", 350.0, "g", "pasta", false),
                Ingredient("Paprika", 8.0, "tsp", "spice", true),
                Ingredient("Black pepper", 1.0, "tsp", "spice", true),
                Ingredient("Salt", 2.0, "tsp", "baking", true),
                Ingredient("Olive oil", 2.0, "tbsp", "oil", true)
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
                Ingredient("Veggie meat", 300.0, "g", "frozen", false),
                Ingredient("Pasta sauce", 400.0, "g", "pasta", false),
                Ingredient("Spaghetti", 350.0, "g", "pasta", false),
                Ingredient("Cheese", 30.0, "g", "dairy", false),
                Ingredient("Ketchup", 4.0, "tbsp", "condiment", true),
                Ingredient("Black pepper", 1.0, "tsp", "spice", true),
                Ingredient("Salt", 2.0, "tsp", "baking", true),
                Ingredient("Olive oil", 2.0, "tbsp", "oil", true)
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
                Ingredient("Carrot", 2.0, "", "vegetable", false),
                Ingredient("Broccoli", 1.0, "", "vegetable", false),
                Ingredient("Zucchini", 1.0, "", "vegetable", false),
                Ingredient("Tagliatelle", 350.0, "g", "pasta", false),
                Ingredient("Pesto", 190.0, "g", "pasta", false),
                Ingredient("Black pepper", 1.0, "tsp", "spice", true),
                Ingredient("Salt", 2.0, "tsp", "baking", true),
                Ingredient("Olive oil", 2.0, "tbsp", "oil", true)
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
                Ingredient("Red onion", 0.25, "", "vegetable", false),
                Ingredient("Tomato", 1.0, "", "vegetable", false),
                Ingredient("Romaine lettuce", 40.0, "g", "vegetable", false),
                Ingredient("Hamburger buns", 4.0, "", "bread", false),
                Ingredient("Veggie patties", 4.0, "", "frozen", false),
                Ingredient("Fries", 0.5, "kg", "frozen", false),
                Ingredient("Ketchup", 4.0, "tbsp", "condiment", true),
                Ingredient("Mustard", 4.0, "tbsp", "condiment", true),
                Ingredient("Hamburger dressing", 4.0, "tbsp", "condiment", true),
                Ingredient("Garlic powder", 1.0, "tsp", "spice", true),
                Ingredient("Paprika", 1.0, "tsp", "spice", true),
                Ingredient("Black pepper", 1.0, "tsp", "spice", true),
                Ingredient("Salt", 2.0, "tsp", "baking", true),
                Ingredient("Olive oil", 2.0, "tbsp", "oil", true)
            ),
            "1. Do this \n" +
                    "2. Do this \n" +
                    "3. Do this\n" +
                    "4. Do this\n" +
                    "5. Do this"
        )
    )

}
