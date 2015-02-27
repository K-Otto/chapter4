package ac.za.cput.chapter4.isp.violation;

/**
 * Created by student on 2015/02/27.
 */
public interface PriceCalc {
    public double termPrice(double m1);
    public double avgTerm(int AnimalCode, double totTermPrice);
    public double yearPrice(double totPrice, int AnimalCode);
}
