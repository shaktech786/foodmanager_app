package com.springapp.mvc.controllers;

import com.springapp.mvc.services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/recipes")

public class RecipesController {

    @Autowired
    private RecipeService recipeService;

    @RequestMapping(method = RequestMethod.POST)
    public String displayRecipes(@RequestParam String ingredients, ModelMap modelMap) {
        modelMap.addAttribute("ingredientList", ingredients);
        modelMap.addAttribute("allRecipes", recipeService.getRecipes());
        return "recipes";
    }
}
