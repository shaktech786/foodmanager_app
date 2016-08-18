package com.springapp.mvc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml")
public class RecipesControllerTest {

    @Test
     public void shouldDisplayRecipesPageWhenRootRouteIsHit() {
        RecipesController recipesController = new RecipesController();

        assertThat(recipesController.displayRecipes(), is("recipes"));
    }
}