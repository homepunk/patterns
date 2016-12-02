package realisation;

import car.Car;
import carImpl.BigCar;
import carImpl.CheapCar;
import carImpl.FastCar;
import factoryImpl.BigCarFactory;
import factoryImpl.CheapCarFactory;
import factoryImpl.FastCarFactory;

import java.util.ArrayList;
import java.util.List;

public class ConveyorExample {
    List<Car> cars = new ArrayList<Car>();

    ConveyorExample() {
        Car fastCar = new FastCar();
        Car cheapCar = new CheapCar();
        Car bigCar = new BigCar();
        FastCarFactory fc = new FastCarFactory();
        BigCarFactory bc = new BigCarFactory();
        CheapCarFactory cc = new CheapCarFactory();

        cars.add(fc.createCar());
        cars.add(bc.createCar());
        cars.add(cc.createCar());

        for (Car car : cars) {
            car.showCar();
        }

        for (Car car : cars) {
            car.attachWheels();
            car.buildEngine();
            car.showCar();
        }
    }

    public static void main(String[] args) {
        ConveyorExample conveyorExample = new ConveyorExample();
    }
}
