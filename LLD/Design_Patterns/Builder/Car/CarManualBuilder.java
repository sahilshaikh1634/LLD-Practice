package org.sahil.LLD.Design_Patterns.Builder.Car;

import lombok.Setter;
import org.sahil.LLD.Design_Patterns.Builder.Car.component.*;

@Setter
public class CarManualBuilder implements Builder {

    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    public CarManual getResult(){
        return new CarManual(type,seats,engine,transmission,tripComputer,gpsNavigator);
    }

    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }
}
