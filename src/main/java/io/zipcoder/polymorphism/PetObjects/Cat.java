package io.zipcoder.polymorphism.PetObjects;

import io.zipcoder.polymorphism.interfaces.Pets;

import java.util.Properties;

public class Cat extends Pets {
    public Cat(String petName) {
        super(petName);
    }

    public String speak(){
        return "Meow";



    }
}
