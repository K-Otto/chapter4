package ac.za.cput.chapter4.dip.correction.Impl;

import ac.za.cput.chapter4.dip.correction.Salary;

/**
 * Created by student on 2015/02/27.
 */
public class OwnerSalaryImpl {

        Salary income;
        public void setSalary(Salary t)
        {
            income = t;
        }
        public double principleSalary()
        {
            double sal = income.salary(5) + 1500;
            return sal;
        }
    }

