package factoryImpl;

import car.Car;
import carImpl.FastCar;
import factory.ConveyorFactory;

public class FastCarFactory implements ConveyorFactory {
    private static String engineModel = "No engine";
    private static int wheels = 0;

    @Override
    public void buildEngine() {
        this.engineModel = "Fast car engine";
    }

    @Override
    public void attachWheels() {
        this.wheels = 4;
    }

    @Override
    public Car createCar() {
        return new FastCar();
    }

    public static String getEngineModel() {
        return engineModel;
    }

    public static int getWheels() {
        return wheels;
    }

}
