package org.sahil.LLD.Design_Patterns.Builder.Car;

import lombok.Getter;
import org.sahil.LLD.Design_Patterns.Builder.Car.component.*;
@Getter
public class Car {

    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    private double fuel = 0;


    public Car(CarType type, int seats, Engine engine, Transmission transmission, TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        if(this.tripComputer!=null) this.tripComputer.setCar(this);
        this.gpsNavigator = gpsNavigator;
    }


}
