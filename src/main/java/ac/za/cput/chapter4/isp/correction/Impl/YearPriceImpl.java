package ac.za.cput.chapter4.isp.correction.Impl;

import ac.za.cput.chapter4.isp.correction.YearPrice;

/**
 * Created by student on 2015/02/27.
 */
public class YearPriceImpl implements YearPrice{

    public double yearPrice(double totPrice, int subjectNum) {
        double yPrice = totPrice/subjectNum;
        return yPrice;
    }
}
