package com.springapp.mvc;

import com.springapp.mvc.controllers.RecipesController;
import com.springapp.mvc.services.RecipeService;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.ui.ModelMap;

import static org.hamcrest.Matchers.hasEntry;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml")
public class RecipesControllerTest {


    private ModelMap modelMap;
    private String ingredients;
    private RecipesController recipesController;
    private RecipeService recipeService;

    @Before
    public void setUp() throws Exception {
        modelMap = new ModelMap();
        ingredients = "apples,oranges";
        recipesController = new RecipesController();
        recipeService = mock(RecipeService.class);
    }

    @Test
    @Ignore
    public void shouldReturnRecipesWhenRootRouteIsHit() {
        assertThat(recipesController.displayRecipes(ingredients, modelMap), is("recipes"));
    }

    @Test
    @Ignore
     public void shouldContainCorrectKeyAndValueInModelMapWhenDisplayRecipesIsCalled() {
        recipesController.displayRecipes(ingredients, modelMap);

        assertThat(modelMap, hasEntry("ingredientList", (Object) ingredients));
    }
    
    



}