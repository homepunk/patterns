package factoryImpl;

import car.Car;
import carImpl.FastCar;
import factory.CarFactory;

public class FastCarFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new FastCar();
    }
}
