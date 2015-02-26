package ac.za.cput.chapter4.Inheritance.Impl;

import ac.za.cput.chapter4.Inheritance.AnimalType;

/**
 * Created by student on 2015/02/26.
 */
public class AnimalTypeImpl implements AnimalType {
    private String animal;

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

}
