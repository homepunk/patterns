package carImpl;

import car.Car;
import factoryImpl.BigCarFactory;

import static factoryImpl.BigCarFactory.getEngineModel;
import static factoryImpl.BigCarFactory.getWheels;

public class BigCar implements Car {
    @Override
    public void showCar() {
        System.out.println(getEngineModel() +"\nBig car has " + getWheels() + " wheels\n\n");
    }
}
