package ac.za.cput.chapter4.srp.correction;

import ac.za.cput.chapter4.Config.Config;
import ac.za.cput.chapter4.srp.correction.Impl.Animal1Impl;
import ac.za.cput.chapter4.srp.correction.Impl.AnimalReportImpl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by student on 2015/02/27.
 */
public class SrpCorectionTest {
    private static AnimalReportImpl aReport;
    private static Animal1Impl animal;
    @Before
    public void setUp() throws Exception {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        aReport = (AnimalReportImpl)ctx.getBean("SRP2");
        ApplicationContext ctx1 = new AnnotationConfigApplicationContext(Config.class);
        animal = (Animal1Impl)ctx1.getBean("SRP1");
    }

    @Test
    public void testName() throws Exception {
        animal.setName("Tiger");
        Assert.assertEquals(animal.getName(), "Tiger");

        Assert.assertNotEquals(aReport.generateAnimalReport("Tiger", "Mammal", 11), "Name: Tiger Type: Mammal  Age: 10\n", "Reports are not the same");

    }

    @After
    public void tearDown() throws Exception {


    }
}