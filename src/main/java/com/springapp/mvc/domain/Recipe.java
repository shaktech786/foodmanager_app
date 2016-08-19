package com.springapp.mvc.domain;

import org.springframework.stereotype.Component;

@Component
public class Recipe {
    private String id;
    private String name;
    private String ingredients;
    private String description;

    public Recipe(String id, String name, String ingredients, String description) {
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

    public String getIngredients() {
        return ingredients;
    }

    public String getDescription() {
        return description;
    }
}
