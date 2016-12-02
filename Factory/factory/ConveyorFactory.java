package factory;

import car.Car;

public interface ConveyorFactory {
    public void buildEngine();

    public void attachWheels();

    public Car createCar();
}
