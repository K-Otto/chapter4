package ac.za.cput.chapter4.plk.violation;

import ac.za.cput.chapter4.Config.Config;
import ac.za.cput.chapter4.plk.correction.ZooKeeper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * Created by student on 2015/02/27.
 */
public class PlkViolationTest {

    private static ZooKeeper service;
    private static OwnerPLK owner;
    private static ZooMemberPLK member;
    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        service = (ZooKeeper)ctx.getBean("Plk2");
        ApplicationContext ctxp = new AnnotationConfigApplicationContext(Config.class);
        owner = (OwnerPLK)ctx.getBean("Plk1");
        ApplicationContext ctxt = new AnnotationConfigApplicationContext(Config.class);
        member = (ZooMemberPLK)ctx.getBean("Plk");

    }



    @Test(expected = NullPointerException.class)

        public void exceptionAssertion() throws Exception{
            service.setSalary(22.0);
            owner.getMemberSalary();
    }


    @After
    public void tearDown() throws Exception {


    }
}