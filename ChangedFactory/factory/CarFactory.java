package factory;

import car.Car;

public interface CarFactory {
    public Car createCar(String type);

    public void assebmleCar(String type);

}
