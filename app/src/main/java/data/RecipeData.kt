package data

import com.example.foodplanner.Ingredient
import com.example.foodplanner.R
import com.example.foodplanner.Recipe

object RecipeData {
    val recipes = listOf(
        Recipe(
            "Pesto Pasta",
            R.drawable.baseline_food_bank,
            listOf(
                Ingredient("Penne pasta", 8.0, "ounces"),
                Ingredient("Fresh basil leaves", 2.0, "cups"),
                Ingredient("Garlic", 2.0, "cloves"),
                Ingredient("Pine nuts", 0.5, "cup"),
                Ingredient("Olive oil", 0.5, "cup"),
                Ingredient("Parmesan cheese", 0.5, "cup"),
                Ingredient("Salt", 1.0, "teaspoon"),
                Ingredient("Black pepper", 0.5, "teaspoon")
            ),
            "1. Cook pasta according to package instructions. Reserve 1/2 cup of pasta cooking water.\n" +
                    "2. In a food processor, combine basil, garlic, pine nuts, and Parmesan cheese. Pulse until well combined.\n" +
                    "3. Slowly add olive oil while pulsing until pesto is smooth.\n" +
                    "4. In a large skillet, heat 1 tablespoon of olive oil over medium heat. Add the reserved pasta water and the pesto, and stir until well combined.\n" +
                    "5. Add cooked pasta to skillet and toss to coat. Serve hot."
        ),
        Recipe(
            "Tomato Soup",
            R.drawable.baseline_food_bank,
            listOf(
                Ingredient("Tomatoes", 6.0, "large"),
                Ingredient("Onion", 1.0, "medium"),
                Ingredient("Garlic", 3.0, "cloves"),
                Ingredient("Vegetable broth", 4.0, "cups"),
                Ingredient("Butter", 2.0, "tablespoons"),
                Ingredient("Salt", 1.0, "teaspoon"),
                Ingredient("Sugar", 1.0, "teaspoon"),
                Ingredient("Black pepper", 0.5, "teaspoon"),
                Ingredient("Heavy cream", 0.5, "cup")
            ),
            "1. Heat olive oil in a large pot over medium heat.\n" +
                    "2. Add onion and garlic and sauté until soft and fragrant, about 5 minutes.\n" +
                    "3. Add canned tomatoes (with their juice), broth, sugar, salt, and black pepper to the pot. Bring to a simmer and let cook for 20-30 minutes.\n" +
                    "4. Use an immersion blender or transfer the soup to a blender to puree until smooth.\n" +
                    "5. Stir in heavy cream and let cook for an additional 5 minutes. Serve hot."
        ),
        Recipe(
            "Vegetarian Fried Rice with Tofu",
            R.drawable.baseline_food_bank,
            listOf(
                Ingredient("Cooked rice", 4.0, "cups"),
                Ingredient("Tofu", 8.0, "ounces"),
                Ingredient("Carrots", 2.0, "medium"),
                Ingredient("Peas", 1.0, "cup"),
                Ingredient("Egg", 2.0),
                Ingredient("Soy sauce", 3.0, "tablespoons"),
                Ingredient("Green onions", 3.0, "stalks"),
                Ingredient("Garlic", 3.0, "cloves"),
                Ingredient("Sesame oil", 2.0, "tablespoons"),
                Ingredient("Vegetable oil", 2.0, "tablespoons")
            ),
            "Instructions: \n" +
                    "1. Heat vegetable oil in a large skillet over medium heat. Add garlic and stir for a few seconds until fragrant.\n" +
                    "2. Add tofu and cook until lightly browned, about 5 minutes. Remove tofu from skillet.\n" +
                    "3. Add more vegetable oil to skillet if needed, then add carrots and cook until tender.\n" +
                    "4. Push the carrots to the side of the skillet, then add the beaten eggs. Scramble the eggs until cooked.\n" +
                    "5. Add cooked rice, peas, green onions, soy sauce, sesame oil, and cooked tofu to the skillet. Stir everything together and cook for a few more minutes, until everything is heated through. Serve hot."
        )
    )
}
