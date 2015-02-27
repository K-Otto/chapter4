package ac.za.cput.chapter4.ocp.correction;



/**
 * Created by student on 2015/02/27.
 */
public  class ZooEmployeeOCP implements ZooMemberOCP {

    private String name;
    private String surname;
    public String getName() {
        return name;
    }
    public void setName(String n) {
        this.name = n;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurame(String sn) {
        this.surname = sn;
    }
    public double salary(int classes) {
        double salary;
        salary = classes * 850 * 1.5;
        return salary;
    }
}
