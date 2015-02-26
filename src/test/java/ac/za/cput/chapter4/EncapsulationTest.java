package ac.za.cput.chapter4;

import ac.za.cput.chapter4.Config.Config;

import ac.za.cput.chapter4.Encapsulation.Animal;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by student on 2015/02/26.
 */
public class EncapsulationTest {

    private Animal service;

    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        service = (Animal) ctx.getBean("encaps");

    }

    @Test
    public void testName() throws Exception {
        service.setAnimal("Dog");
        Assert.assertEquals("The type of animal is: ","Dog", service.getAnimal());

    }

    @After
    public void tearDown() throws Exception {


    }
}
