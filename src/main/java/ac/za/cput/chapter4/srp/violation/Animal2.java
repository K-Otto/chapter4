package ac.za.cput.chapter4.srp.violation;

/**
 * Created by student on 2015/02/27.
 */
public interface Animal2 {
    public String getName();
    public void setName(String n);
    public String getType();
    public void setType(String t);
    public String generateAnimalReport(String n, String sn,  double age);
}
