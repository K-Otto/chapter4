package ac.za.cput.chapter4.srp.violation;

import ac.za.cput.chapter4.Config.Config;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by student on 2015/02/27.
 */
public class SrpViolationTest {
    private static Animal2 service;

    @Before
    public void setUp() throws Exception {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        service = (Animal2)ctx.getBean("Srp");

    }

    @Test
    public void testName() throws Exception {
        service.setName("Tiger");
        Assert.assertEquals("Names do not match", service.getName(), "Tiger");
        Assert.assertNotEquals("Reports are not the same",service.generateAnimalReport("Tiger", "Mammal", 20), "Name: Tiger Type: Mammal Age: 75\n");

    }

    @After
    public void tearDown() throws Exception {


    }
}