package ac.za.cput.chapter4.dip.violation.Impl;

/**
 * Created by student on 2015/02/27.
 */
public class OwnerSalaryImpl1 {

        ZooKeeperSalaryImpl1 income;
        public void setSalary(ZooKeeperSalaryImpl1 t)
        {
            income = t;
        }
        public double principleSalary()
        {
            double sal = income.salary(5) + 1500;
            return sal;
        }
    }

