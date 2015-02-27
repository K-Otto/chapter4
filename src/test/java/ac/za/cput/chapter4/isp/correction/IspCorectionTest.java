package ac.za.cput.chapter4.isp.correction;

import ac.za.cput.chapter4.Config.Config;
import ac.za.cput.chapter4.isp.correction.Impl.AnnualPriceImpl;
import ac.za.cput.chapter4.isp.correction.Impl.AveragePriceImpl;
import ac.za.cput.chapter4.isp.correction.Impl.YearPriceImpl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by student on 2015/02/27.
 */
public class IspCorectionTest {
    private static AveragePriceImpl average;
    private static YearPriceImpl year;
    private static AnnualPriceImpl annum;
    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx1 = new AnnotationConfigApplicationContext(Config.class);
        average = (AveragePriceImpl)ctx1.getBean("Isp1");
        ApplicationContext ctx2 = new AnnotationConfigApplicationContext(Config.class);
        annum = (AnnualPriceImpl)ctx2.getBean("Isp2");
        ApplicationContext ctx3 = new AnnotationConfigApplicationContext(Config.class);
        year = (YearPriceImpl)ctx3.getBean("Isp3");

    }

    @Test
    public void testName() throws Exception {
        Assert.assertEquals(annum.annualPrice(50), 50,0);
        Assert.assertEquals(average.avgPrice(2, 100), 50.0,0);
        Assert.assertEquals(year.yearPrice(100, 2), 50.0,0);

    }

    @After
    public void tearDown() throws Exception {


    }
}
