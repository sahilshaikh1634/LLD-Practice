package org.sahil.LLD.SOLID.Bird.Birdv01;

import org.sahil.LLD.SOLID.Bird.BirdType;
import org.sahil.LLD.SOLID.Bird.Birdv01.Birdv1;

public class Parrot extends Birdv1 {

    Parrot(Double weight, String color, Double size, String beakType, BirdType type){
        super(weight,color,size,beakType,type);
    }

    @Override
    public void fly() {

    }

    @Override
    public void makeSound() {

    }
}
