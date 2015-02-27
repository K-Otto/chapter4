package ac.za.cput.chapter4.isp.correction.Impl;

import ac.za.cput.chapter4.isp.correction.AveragePrice;

/**
 * Created by student on 2015/02/27.
 */
public class AveragePriceImpl implements AveragePrice{
    public double avgPrice(int subjectNum, double totAnnualPrice) {
        double aAnnum = totAnnualPrice/subjectNum;
        return aAnnum;
    }
}
