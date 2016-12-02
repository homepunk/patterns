package factoryImpl;

import car.Car;
import carImpl.CheapCar;
import factory.CarFactory;

public class CheapCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new CheapCar();
    }
}
