package ac.za.cput.chapter4.plk.violation;

import ac.za.cput.chapter4.plk.correction.ZooKeeper;

/**
 * Created by student on 2015/02/27.
 */
public class ZooMemberPLK {
    private ZooKeeper member;
    public double getMemberSalary()
    {
        return member.getSalary();
    }
}