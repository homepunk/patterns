package factoryImpl;

import car.Car;
import carImpl.BigCar;
import factory.CarFactory;

public class BigCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new BigCar();
    }
}
