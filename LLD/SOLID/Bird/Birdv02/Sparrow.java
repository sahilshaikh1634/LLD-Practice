package org.sahil.LLD.SOLID.Bird.Birdv02;

import org.sahil.LLD.SOLID.Bird.BirdType;

public class Sparrow extends Bird implements Flyable  {


    public Sparrow(Double weight, String color, Double size, String beakType, BirdType type) {
        super(weight, color, size, beakType, type);
    }

    @Override
    public void fly() {
        System.out.println("Sparrow can fly");
    }
}
