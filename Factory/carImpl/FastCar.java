package carImpl;

import car.Car;
import factoryImpl.FastCarFactory;

import static factoryImpl.FastCarFactory.getEngineModel;
import static factoryImpl.FastCarFactory.getWheels;

public class FastCar implements Car {
    @Override
    public void showCar() {
        System.out.println(getEngineModel() +"\nFast car has " + getWheels() + " wheels\n\n");
    }
}
