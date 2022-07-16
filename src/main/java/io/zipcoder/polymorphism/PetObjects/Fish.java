package io.zipcoder.polymorphism.PetObjects;

import io.zipcoder.polymorphism.interfaces.Pets;

public class Fish extends Pets {
    public String speak(){
        return "Glub Glub";
    }

    public Fish(String petName) {
        super(petName);

    }
}