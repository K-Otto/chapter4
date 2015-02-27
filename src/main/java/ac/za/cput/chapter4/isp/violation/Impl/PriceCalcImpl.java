package ac.za.cput.chapter4.isp.violation.Impl;

import ac.za.cput.chapter4.isp.violation.PriceCalc;

/**
 * Created by student on 2015/02/27.
 */
public class PriceCalcImpl implements PriceCalc {
    public double termPrice(double m1) {

        return m1;
    }
    public double avgTerm(int AnimalCode, double totTermPrice) {
        double aTerm = totTermPrice/AnimalCode;
        return aTerm;
    }
    public double yearPrice(double totPrice, int AnimalCode) {
        double yPrice = totPrice/AnimalCode;
        return yPrice;
    }
}
