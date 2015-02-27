package ac.za.cput.chapter4.ocp.violation;

/**
 * Created by student on 2015/02/27.
 */
public class ZooSalary {
    public double calcSalary(Object ZooMember1, int classes)
    {
        double salary = 0;
        if(ZooMember1 instanceof Owner1)
        {
            salary = classes * 850 * 1.5 + 1500;
        }
        else
        {
            salary = classes * 850 * 1.5;
        }
        return salary;
    }
}
