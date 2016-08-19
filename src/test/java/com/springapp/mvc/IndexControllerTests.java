package com.springapp.mvc;

import com.springapp.mvc.controllers.IndexController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml")
public class IndexControllerTests {

    @Test
    public void shouldDisplayWelcomePageWhenRootRouteIsHit() {
        IndexController indexController = new IndexController();

        assertThat(indexController.displayIndex(), is("index"));
    }
}
