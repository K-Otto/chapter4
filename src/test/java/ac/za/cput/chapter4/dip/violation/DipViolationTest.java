package ac.za.cput.chapter4.dip.violation;

import ac.za.cput.chapter4.Config.Config;
import ac.za.cput.chapter4.dip.violation.Impl.OwnerSalaryImpl1;
import ac.za.cput.chapter4.dip.violation.Impl.ZooKeeperSalaryImpl1;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by student on 2015/02/27.
 */
public class DipViolationTest {
    private static OwnerSalaryImpl1 owner;
    private static ZooKeeperSalaryImpl1 zooKeeper;
    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx1 = new AnnotationConfigApplicationContext(Config.class);
        zooKeeper = (ZooKeeperSalaryImpl1)ctx1.getBean("DipV1");
        ApplicationContext ctx2 = new AnnotationConfigApplicationContext(Config.class);
        owner = (OwnerSalaryImpl1)ctx2.getBean("DipV");

    }

    @Test
    public void testName() throws Exception {

        Assert.assertEquals(zooKeeper.salary(50), 63750.0,0);
        owner.setSalary(zooKeeper);
        Assert.assertEquals(owner.principleSalary(), 7875.0,0);

    }

    @After
    public void tearDown() throws Exception {


    }
}