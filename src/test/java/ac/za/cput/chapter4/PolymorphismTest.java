package ac.za.cput.chapter4;

import ac.za.cput.chapter4.Config.Config;
import ac.za.cput.chapter4.Polymorphism.Impl.AdultFoodImpl;
import ac.za.cput.chapter4.Polymorphism.Impl.BabyFoodImpl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by student on 2015/02/26.
 */
public class PolymorphismTest {
    private static AdultFoodImpl adultServing;
    private static BabyFoodImpl babyServing;
    @Before
    public void setUp() throws Exception {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        adultServing = (AdultFoodImpl)ctx.getBean("adult");
        ApplicationContext ctz = new AnnotationConfigApplicationContext(Config.class);
        babyServing = (BabyFoodImpl)ctz.getBean("baby");

    }

    @Test
    public void testAdultFood() throws Exception {

            adultServing.setServing(3);
            Assert.assertEquals("Adult animals serving is",6, adultServing.food(),0);
        }
    @Test
    public void testBabyFood() throws Exception {
        babyServing.setServing(3);
            Assert.assertEquals("Baby animals serving is ", 3, babyServing.food(),0);
        }





    @After
    public void tearDown() throws Exception {


    }
}
