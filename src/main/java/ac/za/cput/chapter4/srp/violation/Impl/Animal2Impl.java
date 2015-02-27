package ac.za.cput.chapter4.srp.violation.Impl;

import ac.za.cput.chapter4.srp.violation.Animal2;

/**
 * Created by student on 2015/02/27.
 */
public class Animal2Impl implements Animal2 {

    private String name;
    private String surname;
    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
    public String getType() {
        return surname;
    }
    public void setType(String sn) {
        sn = surname;
    }
    public String generateAnimalReport(String n, String sn, double mark) {
        return "Name: "+n+" Type: "+sn+" Age: "+mark+"\n";
    }
}
