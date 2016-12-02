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

    @Override
    public void assebmleCar(String type) {
        Car car;
        car = createCar(type);
        car.attachWheels();
        car.carPaint();
        car.installWindows();
        car.buildEngine();
        car.showCar();

    }

    enum CarType {
        BIGCAR, CHEAPCAR, FASTCAR;
    }
}
