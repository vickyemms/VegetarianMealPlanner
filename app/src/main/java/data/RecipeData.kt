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
            "1. Heat vegetable oil in a large skillet over medium heat. Add garlic and stir for a few seconds until fragrant.\n" +
                    "2. Add tofu and cook until lightly browned, about 5 minutes. Remove tofu from skillet.\n" +
                    "3. Add more vegetable oil to skillet if needed, then add carrots and cook until tender.\n" +
                    "4. Push the carrots to the side of the skillet, then add the beaten eggs. Scramble the eggs until cooked.\n" +
                    "5. Add cooked rice, peas, green onions, soy sauce, sesame oil, and cooked tofu to the skillet. Stir everything together and cook for a few more minutes, until everything is heated through. Serve hot."
        ),
        Recipe(
            "Tacos",
            R.drawable.baseline_food_bank,
            listOf(
                Ingredient("Taco shells", 6.0),
                Ingredient("Ground beef", 1.0, "lb"),
                Ingredient("Taco seasoning", 2.0, "tbsp"),
                Ingredient("Lettuce", 1.0, "cup"),
                Ingredient("Tomatoes", 2.0),
                Ingredient("Shredded cheese", 1.0, "cup"),
                Ingredient("Sour cream", 1.0, "cup"),
                Ingredient("Salsa", 1.0, "cup")
            ),
            "1. Brown the ground beef in a large skillet over medium-high heat.\n" +
                    "2. Add the taco seasoning and cook for another 5 minutes.\n" +
                    "3. Preheat the taco shells in the oven according to package instructions.\n" +
                    "4. Serve the beef mixture in the taco shells and top with lettuce, tomato, cheese, and sour cream."
        ),
        Recipe(
            "Spaghetti Bolognese",
            R.drawable.baseline_food_bank,
            listOf(
                Ingredient("Spaghetti", 1.0, "lb"),
                Ingredient("Ground beef", 1.0, "lb"),
                Ingredient("Onion", 1.0),
                Ingredient("Garlic", 2.0, "cloves"),
                Ingredient("Tomato paste", 2.0, "tbsp"),
                Ingredient("Crushed tomatoes", 1.0, "can"),
                Ingredient("Red wine", 1.0, "cup"),
                Ingredient("Oregano", 1.0, "tsp"),
                Ingredient("Salt", 1.0, "tsp"),
                Ingredient("Black pepper", 0.5, "tsp")
            ),
            "1. Cook the spaghetti according to package instructions.\n" +
                    "2. In a large skillet, heat the olive oil over medium heat.\n" +
                    "3. Add the onion and garlic and cook until softened.\n" +
                    "4. Add the ground beef and cook until browned, breaking up any clumps with a spatula.\n" +
                    "5. Add the tomato sauce, salt, and pepper and simmer for 10 minutes.\n" +
                    "6. Serve the beef sauce over the spaghetti."
        ),
        Recipe(
            "Swedish Meatballs",
            R.drawable.baseline_food_bank,
            listOf(
                Ingredient("Ground Beef", 1.5, "lbs"),
                Ingredient("Breadcrumbs", 1.0, "cup"),
                Ingredient("Onion, finely chopped", 1.0, "medium"),
                Ingredient("Garlic, minced", 2.0, "cloves"),
                Ingredient("Egg, lightly beaten", 1.0, ""),
                Ingredient("Milk", 0.5, "cup"),
                Ingredient("Salt", 0.5, "tsp"),
                Ingredient("Black Pepper", 0.25, "tsp"),
                Ingredient("Butter", 2.0, "tbsp"),
                Ingredient("All-Purpose Flour", 2.0, "tbsp"),
                Ingredient("Beef Broth", 2.0, "cups"),
                Ingredient("Sour Cream", 0.5, "cup")
            ),
            "1. In a large mixing bowl, combine the ground beef, breadcrumbs, chopped onion, minced garlic, beaten egg, milk, salt, and black pepper. Mix well with your hands until all ingredients are evenly combined.\n" +
                    "2. Using your hands, shape the mixture into 1 1/2 inch meatballs.\n" +
                    "3. Melt the butter in a large skillet over medium heat. Add the meatballs to the skillet and cook until browned on all sides and cooked through, about 10-15 minutes.\n" +
                    "4. Remove the meatballs from the skillet and set aside.\n" +
                    "5. Sprinkle 2 tablespoons of flour into the pan drippings in the skillet. Whisk the flour into the drippings until smooth and cook for 1-2 minutes.\n" +
                    "6. Slowly pour in the beef broth, whisking constantly, until the mixture is smooth and bubbly.\n" +
                    "7. Stir in the sour cream and return the meatballs to the skillet.\n" +
                    "8. Reduce heat to low and simmer for an additional 10-15 minutes, stirring occasionally, until the sauce has thickened and the meatballs are heated through. Serve hot with mashed potatoes, lingonberry jam, and a side of steamed vegetables."
        )
    )


}
