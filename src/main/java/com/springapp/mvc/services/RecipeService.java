package com.springapp.mvc.services;

import com.springapp.mvc.domain.Recipe;
import com.springapp.mvc.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class RecipeService {

    private RecipeRepository recipeRepository;

    @Autowired
    public RecipeService(RecipeRepository recipeRepository) {

        this.recipeRepository = recipeRepository;
    }

    public HashMap<String, Recipe> getRecipes() {
        return recipeRepository.getAllRecipes();
    }
}
