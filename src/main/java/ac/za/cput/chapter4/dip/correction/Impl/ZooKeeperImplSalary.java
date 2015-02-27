package ac.za.cput.chapter4.dip.correction.Impl;

import ac.za.cput.chapter4.dip.correction.Salary;

/**
 * Created by student on 2015/02/27.
 */
public class ZooKeeperImplSalary implements Salary{

    public double salary(int classes) {
        double salary;
        salary = classes * 850 * 1.5;
        return salary;
    }
}