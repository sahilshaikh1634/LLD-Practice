package org.sahil.LLD.SOLID.Bird.Birdv02;

import org.sahil.LLD.SOLID.Bird.BirdType;

public class Penguin extends Bird implements Swimable {

    public Penguin(Double weight, String color, Double size, String beakType, BirdType type) {
        super(weight, color, size, beakType, type);
    }

    @Override
    public void swim() {
        System.out.println("Penguin can swim");
    }
}
