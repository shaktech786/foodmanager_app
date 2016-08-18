package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/recipes")

public class RecipesController {

    @RequestMapping(method = RequestMethod.POST)
    public String displayRecipes(@RequestParam String ingredients, ModelMap modelMap) {
        modelMap.addAttribute("ingredientList", ingredients);
        return "recipes";
    }
}
