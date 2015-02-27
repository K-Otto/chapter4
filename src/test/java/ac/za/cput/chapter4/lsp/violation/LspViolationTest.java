package ac.za.cput.chapter4.lsp.violation;

import ac.za.cput.chapter4.Config.Config;
import ac.za.cput.chapter4.lsp.violation.Impl.AnimalsImpl1;
import ac.za.cput.chapter4.lsp.violation.Impl.EmployeeImpl1;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by student on 2015/02/27.
 */
public class LspViolationTest {
    private static AnimalsImpl1 animal;
    private static EmployeeImpl1 employee;
    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx1 = new AnnotationConfigApplicationContext(Config.class);
        employee = (EmployeeImpl1)ctx1.getBean("LspV1");
        ApplicationContext ctx2 = new AnnotationConfigApplicationContext(Config.class);
        animal = (AnimalsImpl1)ctx2.getBean("LspV");

    }

    @Test
    public void testName() throws Exception {
        employee.setEmployeeNumber("S6992");
        animal.setName("Tiger");
        Assert.assertEquals(employee.getEmployeeNumber(),"S6992");
        Assert.assertEquals(animal.getName(), "Tiger");

    }

    @After
    public void tearDown() throws Exception {


    }
}