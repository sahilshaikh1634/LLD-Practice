package org.sahil.LLD.SOLID.Bird.Birdv0;

// Bird Implemented without applying SOLID principle

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.sahil.LLD.SOLID.Bird.BirdType;

@Getter
@AllArgsConstructor
public class Birdv0
{
    private Double weight;
    private String color;
    private Double size;
    private String beakType;
    private BirdType type;

    public void fly(){
        switch (type){
            case PARROT:
                System.out.println("Parrot is flying");

            case PIGEON:
                System.out.println("Pigeon is flying");

            case PENGUIN:
                System.out.println("Penguin is not flying");

            case SPARROW:
                System.out.println("Sparrow is flying");
        }
    }

}
