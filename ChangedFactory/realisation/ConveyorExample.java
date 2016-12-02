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
        cars.add(car.createCar("BIGCAR"));
        cars.add(car.createCar("FASTCAR"));
        cars.add(car.createCar("CHEAPCAR"));
        for (Car c : cars) {
            c.showCar();
        }

        for (Car c : cars) {
            c.attachWheels();
            c.buildEngine();
            c.showCar();
        }
    }

    public static void main(String[] args) {
        ConveyorExample conveyorExample = new ConveyorExample();
    }
}
