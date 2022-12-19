package org.sahil.LLD.SOLID.Bird.Birdv02;

// Implementation of bird to solve liskov substitution principle

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.sahil.LLD.SOLID.Bird.BirdType;

// Bird implemented using Open-Close Principle and Liskov's substitution method.
// The code should be open for extension and close for modification.
// The code should not have special condition for child class.
@Getter
@AllArgsConstructor
public abstract class Bird {
    private Double weight;
    private String color;
    private Double size;
    private String beakType;
    private BirdType type;
}
