package ac.za.cput.chapter4.ocp.violation;

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
public class OcpViolationTest {
    private static Owner1 owner;
    private static ZooEmployee1 employee;
    private static ZooSalary sal;
    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx1 = new AnnotationConfigApplicationContext(Config.class);
        owner = (Owner1)ctx1.getBean("OcpV");
        ApplicationContext ctx2 = new AnnotationConfigApplicationContext(Config.class);
        employee = (ZooEmployee1)ctx2.getBean("OcpV1");
        ApplicationContext ctx3 = new AnnotationConfigApplicationContext(Config.class);
        sal = (ZooSalary)ctx3.getBean("OcpV2");

    }

    @Test
    public void testName() throws Exception {

        Assert.assertEquals(sal.calcSalary(owner, 20), 27000.0,0);
        Assert.assertEquals(sal.calcSalary(employee, 20), 25500.0,0);
    }

    @After
    public void tearDown() throws Exception {


    }
}