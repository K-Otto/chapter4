package ac.za.cput.chapter4;

import ac.za.cput.chapter4.Config.Config;
import ac.za.cput.chapter4.Inheritance.Impl.AnimalTypeImpl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by student on 2015/02/26.
 */
public class InheritanceTest {
    private static AnimalTypeImpl animal1;
    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        animal1 = (AnimalTypeImpl)ctx.getBean("inher");


    }

    @Test
    public void testName() throws Exception {
        animal1.setAnimal("Dog");
        Assert.assertEquals("The Type of animal is: ", "Dog", animal1.getAnimal());

    }

    @After
    public void tearDown() throws Exception {


    }
}
