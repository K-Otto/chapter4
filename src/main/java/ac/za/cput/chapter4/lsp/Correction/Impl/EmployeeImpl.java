package ac.za.cput.chapter4.lsp.Correction.Impl;

import ac.za.cput.chapter4.lsp.Correction.Animals;
import ac.za.cput.chapter4.lsp.Correction.Employee;

/**
 * Created by student on 2015/02/26.
 */
public class EmployeeImpl implements Employee, Animals{

    private String name;
    private String type;
    private String employeeNum;
    public void setName(String n) {
        this.name = n;
    }
    public String getName() {
        return name;
    }
    public void setType(String sn) {
        this.type = sn;
    }
    public String getType() {
        return type;
    }
    public void setEmployeeNumber(String tn) {
        this.employeeNum = tn;
    }
    public String getEmployeeNumber() {
        return employeeNum;
    }

}
