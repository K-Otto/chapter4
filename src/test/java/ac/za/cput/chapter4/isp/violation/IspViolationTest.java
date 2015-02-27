package ac.za.cput.chapter4.isp.violation;

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
public class IspViolationTest {
    private  PriceCalc service;
    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        service = (PriceCalc)ctx.getBean("Isp");

    }

    @Test
    public void testName() throws Exception {

        Assert.assertEquals(service.termPrice(50), 50,0);
        Assert.assertEquals(service.avgTerm(2, 100), 50.0,0);
        Assert.assertEquals(service.yearPrice(100, 2), 50.0,0);

    }

    @After
    public void tearDown() throws Exception {


    }
}