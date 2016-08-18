package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/recipes")

public class RecipesController {

    @RequestMapping(method = RequestMethod.POST)
    public String displayRecipes() {
        return "recipes";
    }
}
