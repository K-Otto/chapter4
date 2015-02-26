package ac.za.cput.chapter4.Config;

import ac.za.cput.chapter4.Encapsulation.Animal;
import ac.za.cput.chapter4.Inheritance.AnimalType;
import ac.za.cput.chapter4.Inheritance.Impl.AnimalTypeImpl;
import ac.za.cput.chapter4.Polymorphism.AnimalFood;
import ac.za.cput.chapter4.Polymorphism.Impl.AdultFoodImpl;
import ac.za.cput.chapter4.Polymorphism.Impl.BabyFoodImpl;
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
    }}
