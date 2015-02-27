package ac.za.cput.chapter4.plk.correction;

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
public class PlkCorectionTest {
    private static ZooKeeper service;
    private static Owner owner;
    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        service = (ZooKeeper)ctx.getBean("Plk2");
        ApplicationContext ctxp = new AnnotationConfigApplicationContext(Config.class);
        owner = (Owner)ctx.getBean("Plk3");

    }

    @Test
    public void testName() throws Exception {
        service.setSalary(22.0);
        owner.setEmployee(service);
        Assert.assertEquals(owner.getEmployeeSalary(), 22.0,0);

    }

    @After
    public void tearDown() throws Exception {


    }
}