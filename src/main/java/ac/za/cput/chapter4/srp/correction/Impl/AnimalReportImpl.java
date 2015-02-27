package ac.za.cput.chapter4.srp.correction.Impl;

import ac.za.cput.chapter4.srp.correction.AnimalReport;

/**
 * Created by student on 2015/02/27.
 */
public class AnimalReportImpl implements AnimalReport{
    public String generateAnimalReport(String n, String sn,  double age) {
        return "Name: "+n+" Type: "+sn+" Age: "+age+"\n";
    }
}
