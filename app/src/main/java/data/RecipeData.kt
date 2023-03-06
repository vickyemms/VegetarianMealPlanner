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
        ),
        Recipe(
            "Pad Thai",
            R.drawable.baseline_food_bank,
            listOf(
                Ingredient("Rice noodles", 250.0, "grams"),
                Ingredient("Tofu", 200.0, "grams"),
                Ingredient("Bean sprouts", 150.0, "grams"),
                Ingredient("Garlic", 2.0, "cloves"),
                Ingredient("Shallots", 2.0, "pieces"),
                Ingredient("Egg", 2.0, "pieces"),
                Ingredient("Lime", 1.0, "piece"),
                Ingredient("Peanuts", 50.0, "grams"),
                Ingredient("Vegetable oil", 2.0, "tablespoons"),
                Ingredient("Fish sauce", 3.0, "tablespoons"),
                Ingredient("Tamarind paste", 2.0, "tablespoons"),
                Ingredient("Sugar", 2.0, "tablespoons"),
                Ingredient("Water", 100.0, "milliliters")
            ),
            "1. Soak the rice noodles in warm water for 30 minutes, then drain and set aside.\n" +
                    "2. Peel and crush the garlic and shallots.\n" +
                    "3. Heat the vegetable oil in a wok or large frying pan over medium-high heat.\n" +
                    "4. Add the garlic and shallots and stir-fry until fragrant.\n" +
                    "5. Add the tofu and stir-fry until golden brown.\n" +
                    "6. Crack the eggs into the pan and stir-fry until scrambled.\n" +
                    "7. Add the rice noodles, bean sprouts, peanuts, fish sauce, tamarind paste, sugar, and water.\n" +
                    "8. Stir-fry for a few minutes until the noodles are tender and everything is well combined.\n" +
                    "9. Serve hot with lime wedges on the side."
        ),
        Recipe(
            "Swedish Stroganoff",
            R.drawable.baseline_food_bank,
            listOf(
                Ingredient("Beef tenderloin", 500.0, "g"),
                Ingredient("Salt", 1.0, "tsp"),
                Ingredient("Black pepper", 0.5, "tsp"),
                Ingredient("Butter", 2.0, "tbsp"),
                Ingredient("Onion", 1.0, "pc"),
                Ingredient("Mushrooms", 200.0, "g"),
                Ingredient("Flour", 1.0, "tbsp"),
                Ingredient("Beef broth", 2.0, "cups"),
                Ingredient("Sour cream", 1.0, "cup"),
                Ingredient("Parsley", 1.0, "tbsp")
            ),
            "1. Cut the beef into thin strips and season with salt and black pepper.\n" +
                    "2. In a large skillet, heat butter over medium heat. Add the beef and cook until browned, about 5 minutes. Remove from the skillet and set aside.\n" +
                    "3. In the same skillet, add the onion and mushrooms and cook until softened, about 5 minutes.\n" +
                    "4. Sprinkle flour over the vegetables and cook for 1 minute, stirring constantly.\n" +
                    "5. Slowly add beef broth to the skillet, stirring constantly to prevent lumps. Bring to a simmer and let cook until the sauce thickens, about 5 minutes.\n" +
                    "6. Stir in the cooked beef and sour cream, and let cook for a few minutes until heated through.\n" +
                    "7. Serve with a sprinkle of fresh parsley on top."
        ),
        Recipe(
            "Nachos",
            R.drawable.baseline_food_bank,
            listOf(
                Ingredient("Tortilla chips", 1.0, "bag"),
                Ingredient("Ground beef", 1.0, "lb"),
                Ingredient("Shredded cheddar cheese", 2.0, "cups"),
                Ingredient("Diced tomatoes", 1.0, "cup"),
                Ingredient("Diced onion", 1.0, "cup"),
                Ingredient("Jalapeño peppers, sliced", 1.0, "cup"),
                Ingredient("Sour cream", 1.0, "cup"),
                Ingredient("Guacamole", 1.0, "cup"),
                Ingredient("Salsa", 1.0, "cup")
            ),
            "1. Preheat oven to 375°F (190°C).\n" +
                    "2. Spread tortilla chips in a single layer on a baking sheet.\n" +
                    "3. Cook ground beef in a skillet over medium-high heat until browned and crumbled; drain.\n" +
                    "4. Sprinkle cooked ground beef over tortilla chips.\n" +
                    "5. Top with shredded cheddar cheese, diced tomatoes, diced onion, and sliced jalapeño peppers.\n" +
                    "6. Bake in preheated oven for 10-15 minutes, or until cheese is melted and bubbly.\n" +
                    "7. Serve hot with sour cream, guacamole, and salsa on the side."
        ),
        Recipe(
            "Quesadilla",
            R.drawable.baseline_food_bank,
            listOf(
                Ingredient("Tortillas", 2.0, "pieces"),
                Ingredient("Shredded cheese", 1.5, "cups"),
                Ingredient("Diced tomatoes", 1.0, "cup"),
                Ingredient("Chopped onion", 1.0, "cup"),
                Ingredient("Sliced bell pepper", 1.0, "cup"),
                Ingredient("Sliced mushrooms", 1.0, "cup"),
                Ingredient("Sour cream", 1.0, "cup")
            ),
            "1. Preheat a large skillet or griddle over medium heat.\n" +
                    "2. Place one tortilla in the skillet or on the griddle.\n" +
                    "3. Sprinkle shredded cheese over the tortilla.\n" +
                    "4. Add tomatoes, onion, bell pepper, and mushrooms over the cheese.\n" +
                    "5. Sprinkle more cheese on top of the vegetables.\n" +
                    "6. Place another tortilla on top of the cheese.\n" +
                    "7. Cook until the bottom tortilla is golden brown.\n" +
                    "8. Flip the quesadilla over and cook until the other side is golden brown.\n" +
                    "9. Remove the quesadilla from the skillet or griddle and let it cool for a few minutes.\n" +
                    "10. Cut the quesadilla into wedges and serve with sour cream."
        ),
        Recipe(
            "Spaghetti Carbonara",
            R.drawable.baseline_food_bank,
            listOf(
                Ingredient("spaghetti", 400.0, "g"),
                Ingredient("pancetta or guanciale", 150.0, "g"),
                Ingredient("pecorino romano cheese, grated", 50.0, "g"),
                Ingredient("eggs", 3.0, "whole"),
                Ingredient("garlic", 1.0, "clove"),
                Ingredient("salt", 1.0, "pinch"),
                Ingredient("black pepper, freshly ground", 1.0, "pinch")
            ),
            "1. Cook the spaghetti in a large pot of boiling salted water until al dente, according to the package instructions. Reserve 1 cup of the pasta cooking water, then drain the spaghetti.\n" +
                    "2. Meanwhile, cut the pancetta or guanciale into small pieces. In a large skillet over medium heat, cook the pancetta or guanciale and garlic, stirring occasionally, until the pancetta is browned and crisp, about 7-10 minutes.\n" +
                    "3. In a bowl, whisk together the eggs, grated pecorino cheese, salt, and pepper.\n" +
                    "4. Add the spaghetti to the skillet with the pancetta or guanciale and garlic. Remove the skillet from the heat and add the egg mixture, tossing the spaghetti constantly with tongs until the eggs are cooked and the sauce is creamy. If the sauce seems too thick, add a splash of the reserved pasta water.\n" +
                    "5. Serve the spaghetti carbonara immediately, topped with additional grated pecorino cheese and black pepper if desired."
        ),
        Recipe(
            "Grilled Cheese",
            R.drawable.baseline_food_bank,
            listOf(
                Ingredient("Bread", 2.0, "slices"),
                Ingredient("Cheese", 2.0, "slices"),
                Ingredient("Butter", 1.0, "tbsp")
            ),
            "1. Preheat a skillet or griddle over medium-high heat.\n" +
                    "2. Spread butter on one side of each slice of bread.\n" +
                    "3. Place one slice of bread, butter-side down, in the skillet.\n" +
                    "4. Add the cheese on top of the bread.\n" +
                    "5. Place the other slice of bread, butter-side up, on top of the cheese.\n" +
                    "6. Cook until the bread is golden brown on one side, then flip and cook until the other side is golden brown and the cheese is melted.\n" +
                    "7. Serve hot."
        ),
        Recipe(
            "Mac and Cheese",
            R.drawable.baseline_food_bank,
            listOf(
                Ingredient("Macaroni", 250.0, "g"),
                Ingredient("Butter", 50.0, "g"),
                Ingredient("Flour", 50.0, "g"),
                Ingredient("Milk", 500.0, "ml"),
                Ingredient("Cheddar cheese", 200.0, "g"),
                Ingredient("Salt", 1.0, "tsp"),
                Ingredient("Black pepper", 1.0, "tsp")
            ),
            "1. Cook the macaroni according to package directions.\n" +
                    "2. Melt the butter in a large saucepan over medium heat.\n" +
                    "3. Add the flour and whisk until smooth. Cook for 1 minute, stirring constantly.\n" +
                    "4. Gradually whisk in the milk and continue cooking until the sauce thickens, about 5 minutes.\n" +
                    "5. Add the grated cheddar cheese, salt, and pepper, and stir until the cheese is melted.\n" +
                    "6. Drain the macaroni and add it to the cheese sauce. Stir until well coated. Serve hot."
        ),
        Recipe(
            "Hot Dogs",
            R.drawable.baseline_food_bank,
            listOf(
                Ingredient("Hot dogs", 6.0, "pieces"),
                Ingredient("Hot dog buns", 6.0, "pieces"),
                Ingredient("Ketchup", 1.0, "bottle"),
                Ingredient("Mustard", 1.0, "bottle")
            ),
            "1. Preheat grill to medium-high heat.\n" +
                    "2. Grill hot dogs for 7-10 minutes or until heated through.\n" +
                    "3. Toast hot dog buns on the grill for 1-2 minutes.\n" +
                    "4. Serve hot dogs in buns with ketchup and mustard."
        ),
        Recipe(
            "Hamburgers and Fries",
            R.drawable.baseline_food_bank,
            listOf(
                Ingredient("Ground beef", 1.0, "pound"),
                Ingredient("Hamburger buns", 4.0, "pieces"),
                Ingredient("Cheddar cheese", 4.0, "slices"),
                Ingredient("Lettuce", 4.0, "leaves"),
                Ingredient("Tomato", 1.0, "large"),
                Ingredient("Onion", 1.0, "medium"),
                Ingredient("Salt", 1.0, "teaspoon"),
                Ingredient("Pepper", 1.0, "teaspoon"),
                Ingredient("Potatoes", 4.0, "large"),
                Ingredient("Vegetable oil", 1.0, "cup"),
                Ingredient("Ketchup", 4.0, "tablespoons"),
                Ingredient("Mustard", 4.0, "tablespoons")
            ),
            "1. Preheat grill to high heat.\n" +
                    "2. In a large bowl, mix together ground beef, salt, and pepper. Form into 4 patties.\n" +
                    "3. Slice potatoes into wedges and toss with vegetable oil.\n" +
                    "4. Grill burgers for about 5 minutes per side, until cooked through.\n" +
                    "5. While burgers are cooking, fry potato wedges in a pan over medium-high heat, stirring occasionally, until crispy and golden brown.\n" +
                    "6. Toast hamburger buns on the grill.\n" +
                    "7. Assemble burgers with cheese, lettuce, tomato, and onion.\n" +
                    "8. Serve hamburgers with fries and condiments."
        )
    )


}
