package ac.za.cput.chapter4.Config;

import ac.za.cput.chapter4.Encapsulation.Animal;
import ac.za.cput.chapter4.Inheritance.AnimalType;
import ac.za.cput.chapter4.Inheritance.Impl.AnimalTypeImpl;
import ac.za.cput.chapter4.Polymorphism.AnimalFood;
import ac.za.cput.chapter4.Polymorphism.Impl.AdultFoodImpl;
import ac.za.cput.chapter4.Polymorphism.Impl.BabyFoodImpl;
import ac.za.cput.chapter4.dip.correction.Impl.OwnerSalaryImpl;
import ac.za.cput.chapter4.dip.correction.Impl.ZooKeeperImplSalary;
import ac.za.cput.chapter4.dip.violation.Impl.OwnerSalaryImpl1;
import ac.za.cput.chapter4.dip.violation.Impl.ZooKeeperSalaryImpl1;
import ac.za.cput.chapter4.isp.correction.AnnualPrice;
import ac.za.cput.chapter4.isp.correction.AveragePrice;
import ac.za.cput.chapter4.isp.correction.Impl.AnnualPriceImpl;
import ac.za.cput.chapter4.isp.correction.Impl.AveragePriceImpl;
import ac.za.cput.chapter4.isp.correction.Impl.YearPriceImpl;
import ac.za.cput.chapter4.isp.correction.YearPrice;
import ac.za.cput.chapter4.isp.violation.Impl.PriceCalcImpl;
import ac.za.cput.chapter4.isp.violation.PriceCalc;
import ac.za.cput.chapter4.lsp.Correction.Animals;
import ac.za.cput.chapter4.lsp.Correction.Impl.AnimalsImpl;
import ac.za.cput.chapter4.lsp.Correction.Impl.EmployeeImpl;
import ac.za.cput.chapter4.lsp.violation.Impl.AnimalsImpl1;
import ac.za.cput.chapter4.lsp.violation.Impl.EmployeeImpl1;
import ac.za.cput.chapter4.lsp.violation.ZooMember;
import ac.za.cput.chapter4.ocp.correction.OwnerOCP;
import ac.za.cput.chapter4.ocp.correction.ZooEmployeeOCP;
import ac.za.cput.chapter4.ocp.correction.ZooMemberOCP;
import ac.za.cput.chapter4.ocp.violation.Owner1;
import ac.za.cput.chapter4.ocp.violation.ZooEmployee1;
import ac.za.cput.chapter4.ocp.violation.ZooSalary;
import ac.za.cput.chapter4.plk.correction.Owner;
import ac.za.cput.chapter4.plk.correction.ZooKeeper;
import ac.za.cput.chapter4.plk.violation.OwnerPLK;
import ac.za.cput.chapter4.plk.violation.ZooMemberPLK;
import ac.za.cput.chapter4.srp.correction.Animal1;
import ac.za.cput.chapter4.srp.correction.AnimalReport;
import ac.za.cput.chapter4.srp.correction.Impl.Animal1Impl;
import ac.za.cput.chapter4.srp.correction.Impl.AnimalReportImpl;
import ac.za.cput.chapter4.srp.violation.Animal2;
import ac.za.cput.chapter4.srp.violation.Impl.Animal2Impl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by student on 2015/02/26.
 */
@Configuration
public class Config {


        @Bean(name = "encaps")
        public Animal getService() {
            return new Animal();
        }
    @Bean(name = "inher")
    public AnimalType getProd() {
        return new AnimalTypeImpl();
    }

    @Bean(name = "adult")
    public AnimalFood getServing() {
        return new AdultFoodImpl();
    }
    @Bean(name = "baby")
    public AnimalFood getBServing() {
        return new BabyFoodImpl();
    }

    @Bean (name = "DipC")
    public OwnerSalaryImpl getPri1()
    {
        return new OwnerSalaryImpl();
    }
    @Bean (name = "DipC1")
    public ZooKeeperImplSalary getTea1()
    {
        return new ZooKeeperImplSalary();
    }
    //DIP Violation Bean
    @Bean (name = "DipV")
    public OwnerSalaryImpl1 getPri()
    {
        return new OwnerSalaryImpl1();
    }
    @Bean (name = "DipV1")
    public ZooKeeperSalaryImpl1 getTea()
    {
        return new ZooKeeperSalaryImpl1();
    }
    //Bean for ISP violation
    @Bean (name = "Isp")
    public PriceCalc getISP()
    {
        return new PriceCalcImpl();
    }
    //Bean for ISP Correction
    @Bean (name = "Isp1")
    public AveragePrice getISP1()
    {
        return new AveragePriceImpl();
    }
    @Bean (name = "Isp2")
    public AnnualPrice getISP2()
    {
        return new AnnualPriceImpl();
    }
    @Bean (name = "Isp3")
    public YearPrice getISP3()
    {
        return new YearPriceImpl();
    }
    //Bean for LSP Correction
    @Bean (name = "LspC")
    public Animals getZooKeeper()
    {
        return new EmployeeImpl();
    }
    @Bean (name = "LspC1")
    public EmployeeImpl getEmployee()
    {
        return new EmployeeImpl();
    }
    @Bean (name = "LspC2")
    public Animals getAnimal()
    {
        return new AnimalsImpl();
    }
    //Bean for LSP Violation
    @Bean (name = "LspV")
    public ZooMember getAnimal1()
    {
        return new AnimalsImpl1();
    }
    @Bean (name = "LspV1")
    public ZooMember getEmployee1()
    {
        return new EmployeeImpl1();
    }
    //Bean for OCP violation
    @Bean (name = "OcpV")
    public Owner1 getOcpPrince()
    {
        return new Owner1();
    }
    @Bean (name = "OcpV1")
    public ZooEmployee1 getOcpTeach()
    {
        return new ZooEmployee1();
    }
    @Bean (name = "OcpV2")
    public ZooSalary getOcpSal()
    {
        return new ZooSalary();
    }
    //Bean for OCP correction
    @Bean (name = "OcpC")
    public ZooMemberOCP getOwner3()
    {
        return new OwnerOCP();
    }
    @Bean (name = "OcpC1")
    public ZooMemberOCP getZooEmploy()
    {
        return new ZooEmployeeOCP();
    }
    //Bean for PLK violation
    @Bean (name= "Plk")
    public ZooMemberPLK getPlkMember()
    {
        return new ZooMemberPLK();
    }
    @Bean (name= "Plk1")
    public OwnerPLK getPlkowner()
    {
        return new OwnerPLK();
    }
    @Bean (name= "Plk2")
    public ZooKeeper getPlkKeeper()
    {
        return new ZooKeeper();
    }
    @Bean (name= "Plk3")
    public Owner getPlkowner1()
    {
        return new Owner();
    }
    //Bean for SRP violation
    @Bean(name = "Srp")
    public Animal2 getSRP()
    {
        return new Animal2Impl();
    }
    //Beans for SRP Correction
    @Bean (name = "SRP1")
    public Animal1 getSRPCorrect()
    {
        return new Animal1Impl();
    }
    @Bean (name = "SRP2")
    public AnimalReport getSRPCor()
    {
        return new AnimalReportImpl();
    }
}
