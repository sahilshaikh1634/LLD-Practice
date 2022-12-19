package org.sahil.LLD.SOLID.Bird.Birdv01;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.sahil.LLD.SOLID.Bird.BirdType;

// Bird implemented by applying SRP(Single Responsibility Principle).
// One class/package/module should have one responsibility.

@Getter
@AllArgsConstructor
public abstract class Birdv1 {
    private Double weight;
    private String color;
    private Double size;
    private String beakType;
    private BirdType type;

    public abstract void fly();
    public abstract void makeSound();
}
