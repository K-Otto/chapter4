package ac.za.cput.chapter4.lsp.violation.Impl;

import ac.za.cput.chapter4.lsp.violation.ZooMember;

/**
 * Created by student on 2015/02/27.
 */
public class EmployeeImpl1 implements ZooMember {
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
