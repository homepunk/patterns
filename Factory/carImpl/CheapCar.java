package carImpl;

import car.Car;
import factoryImpl.CheapCarFactory;

import static factoryImpl.CheapCarFactory.getEngineModel;
import static factoryImpl.CheapCarFactory.getWheels;

public class CheapCar implements Car {
    CheapCarFactory cheapCar = null;
    @Override
    public void showCar() {
        System.out.println(getEngineModel() +"\nCheap car has " + getWheels() + " wheels\n\n");
    }


}
