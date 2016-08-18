package com.springapp.mvc;

import java.util.List;

public class Recipe {
    private String id;
    private String name;
    private List<String> ingredients;
    private String description;

    public Recipe(String id, String name, List<String> ingredients, String description) {

        this.id = id;
        this.name = name;
        this.ingredients = ingredients;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public String getDescription() {
        return description;
    }
}
