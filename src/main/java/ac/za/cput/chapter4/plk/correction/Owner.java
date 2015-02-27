package ac.za.cput.chapter4.plk.correction;

/**
 * Created by student on 2015/02/27.
 */
public class Owner {
    ZooKeeper employ;
    public void setEmployee(ZooKeeper s)
    {
        employ = s;
    }
    public double getEmployeeSalary()
    {
        return employ.getSalary();
    }
}
