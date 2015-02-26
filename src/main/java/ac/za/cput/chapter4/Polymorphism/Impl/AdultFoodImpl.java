package ac.za.cput.chapter4.Polymorphism.Impl;

import ac.za.cput.chapter4.Polymorphism.AnimalFood;

/**
 * Created by student on 2015/02/26.
 */
public class AdultFoodImpl implements AnimalFood {
    private double serving;

    public double getServing() {
        return serving;
    }

    public void setServing(double serving) {
        this.serving = serving;
    }

    public double food (){
        serving = getServing() * 2;
        return serving;
    }
}

