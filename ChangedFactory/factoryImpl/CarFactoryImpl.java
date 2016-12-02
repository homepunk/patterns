package factoryImpl;

import car.Car;
import carImpl.BigCar;
import carImpl.CheapCar;
import carImpl.FastCar;
import factory.CarFactory;

public class CarFactoryImpl implements CarFactory {

    @Override
    public Car createCar(String type) {
        if (type == CarType.BIGCAR.toString()) {
            return new BigCar();
        } else if (type == CarType.CHEAPCAR.toString()){
            return new CheapCar();
        } else if (type == CarType.FASTCAR.toString()) {
            return new FastCar();
        } else return null;
    }

    enum CarType {
        BIGCAR, CHEAPCAR, FASTCAR;
    }
}
