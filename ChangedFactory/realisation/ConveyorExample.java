package realisation;

import car.Car;
import carImpl.BigCar;
import carImpl.CheapCar;
import carImpl.FastCar;
import factory.CarFactory;
import factoryImpl.CarFactoryImpl;

import java.util.ArrayList;
import java.util.List;

public class ConveyorExample {
    List<Car> cars = new ArrayList<Car>();

    ConveyorExample() {
        CarFactory car = new CarFactoryImpl();
        car.assebmleCar("BIGCAR");
        car.assebmleCar("CHEAPCAR");
        car.assebmleCar("FASTCAR");

    }

    public static void main(String[] args) {
        ConveyorExample conveyorExample = new ConveyorExample();
    }
}
