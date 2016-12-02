package factoryImpl;

import car.Car;
import carImpl.BigCar;
import factory.ConveyorFactory;

public class BigCarFactory implements ConveyorFactory {
    private static String engineModel = "No engine";
    private static int wheels = 0;

    @Override
    public void buildEngine() {
        this.engineModel = "Big car engine";
    }

    @Override
    public void attachWheels() {
        this.wheels = 4;
    }

    @Override
    public Car createCar() {
        return new BigCar();
    }

    public static String getEngineModel() {
        return engineModel;
    }

    public static int getWheels() {
        return wheels;
    }
}
