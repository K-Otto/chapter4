package ac.za.cput.chapter4.lsp.violation.Impl;

import ac.za.cput.chapter4.lsp.violation.ZooMember;

/**
 * Created by student on 2015/02/27.
 */
public class AnimalsImpl1 implements ZooMember{
    private String name;
    private String type;
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
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public String getEmployeeNumber() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
