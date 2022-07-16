package io.zipcoder.polymorphism.PetObjects;

import io.zipcoder.polymorphism.interfaces.Pets;

public class Dog extends Pets {
    public String speak(){
        return "woof woof";
    }

    public Dog(String petName) {
        super(petName);

    }
}
