package com.springapp.mvc;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ui.ModelMap;

import static org.hamcrest.Matchers.hasEntry;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml")
public class RecipesControllerTest {


    private ModelMap modelMap;
    private String ingredients;
    private RecipesController recipesController;

    @Before
    public void setUp() throws Exception {
        modelMap = new ModelMap();
        ingredients = "apples,oranges";
        recipesController = new RecipesController();
    }

    @Test
    public void shouldReturnRecipesWhenRootRouteIsHit() {
        assertThat(recipesController.displayRecipes(ingredients, modelMap), is("recipes"));
    }

    @Test
     public void shouldContainCorrectKeyAndValueInModelMapWhenDisplayRecipesIsCalled() {
        recipesController.displayRecipes(ingredients, modelMap);

        assertThat(modelMap, hasEntry("ingredientList", (Object) ingredients));
    }
    
    



}