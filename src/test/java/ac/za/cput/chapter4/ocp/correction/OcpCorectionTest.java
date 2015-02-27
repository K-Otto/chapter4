package ac.za.cput.chapter4.ocp.correction;

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
public class OcpCorectionTest {
    private static OwnerOCP owner;
    private static ZooEmployeeOCP employee;
    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx1 = new AnnotationConfigApplicationContext(Config.class);
        owner = (OwnerOCP)ctx1.getBean("OcpC");
        ApplicationContext ctx2 = new AnnotationConfigApplicationContext(Config.class);
        employee = (ZooEmployeeOCP)ctx2.getBean("OcpC1");


    }

    @Test
    public void testName() throws Exception {
        Assert.assertEquals(owner.salary(20), 27000,0);
        Assert.assertEquals(employee.salary(20), 25500,0);

    }

    @After
    public void tearDown() throws Exception {


    }
}