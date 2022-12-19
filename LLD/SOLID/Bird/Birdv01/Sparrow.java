package org.sahil.LLD.SOLID.Bird.Birdv01;

import org.sahil.LLD.SOLID.Bird.BirdType;
import org.sahil.LLD.SOLID.Bird.Birdv01.Birdv1;

public class Sparrow extends Birdv1 {
    Sparrow(Double weight, String color, Double size, String beakType, BirdType type){
        super(weight,color,size,beakType,type);
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }

    @Override
    public void makeSound() {
        System.out.println("Sparrow is making a sound");
    }
}
