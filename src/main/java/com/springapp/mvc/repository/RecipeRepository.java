package com.springapp.mvc.repository;

import com.springapp.mvc.domain.Recipe;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class RecipeRepository {

    private final HashMap<String, Recipe> recipeMap = new HashMap<>();

    public RecipeRepository() {
        Recipe one = new Recipe("1", "My Favorite Simple Roast Chicken", "One 2- to 3-pound farm-raised chicken"+
                "Kosher salt and freshly ground black pepper"+
                "2 teaspoons minced thyme (optional)", "Preheat the oven to 450°F. Rinse the chicken, then dry it very well with paper towels, inside and out. The less it steams, the drier the heat, the better."+
                "Salt and pepper the cavity, then truss the bird. Trussing is not difficult, and if you roast chicken often, it's a good technique to feel comfortable with. When you truss a bird, the wings and legs stay close to the body; the ends of the drumsticks cover the top of the breast and keep it from drying out. Trussing helps the chicken to cook evenly, and it also makes for a more beautiful roasted bird."+
                "Now, salt the chicken—I like to rain the salt over the bird so that it has a nice uniform coating that will result in a crisp, salty, flavorful skin (about 1 tablespoon). When it's cooked, you should still be able to make out the salt baked onto the crisp skin. Season to taste with pepper."+
                "Place the chicken in a sauté pan or roasting pan and, when the oven is up to temperature, put the chicken in the oven. I leave it alone—I don't baste it, I don't add butter; you can if you wish, but I feel this creates steam, which I don't want. Roast it until it's done, 50 to 60 minutes. Remove it from the oven and add the thyme, if using, to the pan. Baste the chicken with the juices and thyme and let it rest for 15 minutes on a cutting board."+
                "Remove the twine. Separate the middle wing joint and eat that immediately. Remove the legs and thighs. I like to take off the backbone and eat one of the oysters, the two succulent morsels of meat embedded here, and give the other to the person I'm cooking with. But I take the chicken butt for myself. I could never understand why my brothers always fought over that triangular tip—until one day I got the crispy, juicy fat myself. These are the cook's rewards. Cut the breast down the middle and serve it on the bone, with one wing joint still attached to each. The preparation is not meant to be superelegant. Slather the meat with fresh butter. Serve with mustard on the side and, if you wish, a simple green salad. You'll start using a knife and fork, but finish with your fingers, because it's so good.");

        Recipe two = new Recipe("2", "Chicken Tikka Masala", "6 garlic cloves, finely grated"+
                "4 teaspoons finely grated peeled ginger"+
                "4 teaspoons ground turmeric"+
                "2 teaspoons garam masala"+
                "2 teaspoons ground coriander"+
                "2 teaspoons ground cumin"+
                "1 1/2 cups whole-milk yogurt (not Greek)"+
                "1 tablespoon kosher salt"+
                "2 pounds skinless, boneless chicken breasts, halved lengthwise"+
                "3 tablespoons ghee (clarified butter) or vegetable oil"+
                "1 small onion, thinly sliced"+
                "1/4 cup tomato paste"+
                "6 cardamom pods, crushed"+
                "2 dried chiles de árbol or 1/2 teaspoon crushed red pepper flakes"+
                "1 28-ounce can whole peeled tomatoes"+
                "2 cups heavy cream"+
                "3/4 cup chopped fresh cilantro plus sprigs for garnish"+
                "Steamed basmati rice (for serving)", "Combine garlic, ginger, turmeric, garam masala, coriander, and cumin in a small bowl. Whisk yogurt, salt, and half of spice mixture in a medium bowl; add chicken and turn to coat. Cover and chill 4-6 hours. Cover and chill remaining spice mixture."+
                "Heat ghee in a large heavy pot over medium heat. Add onion, tomato paste, cardamom, and chiles and cook, stirring often, until tomato paste has darkened and onion is soft, about 5 minutes. Add remaining half of spice mixture and cook, stirring often, until bottom of pot begins to brown, about 4 minutes."+
                "Add tomatoes with juices, crushing them with your hands as you add them. Bring to a boil, reduce heat, and simmer, stirring often and scraping up browned bits from bottom of pot, until sauce thickens, 8-10 minutes."+
                "Add cream and chopped cilantro. Simmer, stirring occasionally, until sauce thickens, 30-40 minutes."+
                "Meanwhile, preheat broiler. Line a rimmed baking sheet with foil and set a wire rack inside sheet. Arrange chicken on rack in a single layer. Broil until chicken starts to blacken in spots (it will not be cooked through), about 10 minutes."+
                "Cut chicken into bite-size pieces, add to sauce, and simmer, stirring occasionally, until chicken is cooked through, 8-10 minutes. Serve with rice and cilantro sprigs."+
                "DO AHEAD: _Chicken can be made 2 days ahead. Cover; chill. Reheat before serving._");

        Recipe three = new Recipe("3", "Roast Pork Loin with Garlic and Rosemary", "4 large garlic cloves, pressed"+
                "4 teaspoons chopped fresh rosemary or 2 teaspoons dried"+
                "1 1/2 teaspoons coarse salt"+
                "1/2 teaspoon ground black pepper"+
                "1 2 1/2-pound boneless pork loin roast, well trimmed"+
                "Fresh rosemary sprigs (optional)", "Preheat oven to 400°F. Line 13 x 9 x 2-inch roasting pan with foil. Mix first 4 ingredients in bowl. Rub garlic mixture all over pork. Place pork, fat side down, in prepared roasting pan. Roast pork 30 minutes. Turn roast fat side up. Roast until thermometer inserted into center of pork registers 155°F., about 25 minutes longer. Remove from oven; let stand 10 minutes."+
                "Pour any juices from roasting pan into small saucepan; set over low heat to keep warm. Cut pork crosswise into 1/3-inch-thick slices. Arrange pork slices on platter. Pour pan juices over. Garnish with rosemary sprigs, if desired.");

        Recipe four = new Recipe("4", "Key Lime Pie", "1 1/4 cups graham cracker crumbs from 9 (2 1/4-inch by 4 3/4-inch) crackers"+
                "2 tablespoons sugar"+
                "5 tablespoons unsalted butter, melted"+"1 (14-ounce) can sweetened condensed milk"+
                "4 large egg yolks"+
                "1/2 cup plus 2 tablespoons fresh or bottled Key lime juice (if using bottled, preferably Manhattan brand)", "Preheat oven to 350°F."+
                "Stir together graham cracker crumbs, sugar, and butter in a bowl with a fork until combined well, then press mixture evenly onto bottom and up side of a 9-inch (4-cup) glass pie plate."+
                "Bake crust in middle of oven 10 minutes and cool in pie plate on a rack. Leave oven on.");

        Recipe five = new Recipe("5", "Simple Hot Cocoa For One", "2 tablespoons unsweetened cocoa powder"+
                "1 to 2 tablespoons sugar (depending on how sweet you like it)"+
                "Pinch of salt"+
                "1 cup milk or any combination of milk, half-and-half, or cream"+
                "1/4 teaspoon vanilla extract", "Whisk together the cocoa, sugar, salt, and about 2 tablespoons milk in a small saucepan over medium-low heat until cocoa and sugar are dissolved. Whisk in the rest of the milk and heat it over medium heat, whisking occasionally, until it is hot. Stir in the vanilla and serve."+
                "If you like it frothy, blend it in the blender."+
                "This recipe multiplies easily. When you get up to a quart of milk, use 1/4 teaspoon salt.");

        Recipe six = new Recipe("6", "Herb Roasted Lamb Chops", "4 large garlic cloves, pressed"+
                "1 tablespoon fresh thyme leaves, lightly crushed"+
                "1 tablespoon fresh rosemary leaves, lightly crushed"+
                "2 teaspoons coarse kosher salt"+
                "2 tablespoons extra-virgin olive oil, divided"+
                "6 1 1/4-inch-thick lamb loin chops", "Mix first 4 ingredients and 1 tablespoon olive oil in large bowl. Add lamb; turn to coat. Let marinate at room temperature at least 30 minutes and up to 1 hour."+
                "Preheat oven to 400°F. Heat remaining 1 tablespoon olive oil in heavy large ovenproof skillet over high heat. Add lamb; cook until browned, about 3 minutes per side. Transfer skillet to oven and roast lamb chops to desired doneness, about 10 minutes for medium-rare. Transfer lamb to platter, cover, and let rest 5 minutes.");

        recipeMap.put(one.getId(), one);
        recipeMap.put(two.getId(), two);
        recipeMap.put(three.getId(), three);
        recipeMap.put(four.getId(), four);
        recipeMap.put(five.getId(), five);
        recipeMap.put(six.getId(), six);
    }

    public HashMap<String, Recipe> getAllRecipes() {
        return recipeMap;
    }
}
