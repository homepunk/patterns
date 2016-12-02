package realisation;

import car.Car;
import factory.ConveyorFactory;
import factoryImpl.BigCarFactory;
import factoryImpl.CheapCarFactory;
import factoryImpl.FastCarFactory;

import java.util.ArrayList;
import java.util.List;

public class ConveyorExample {
    List<Car> cars = new ArrayList<Car>();

    ConveyorExample() {
        FastCarFactory fc = new FastCarFactory();
        BigCarFactory bc = new BigCarFactory();
        CheapCarFactory cc = new CheapCarFactory();

        cars.add(fc.createCar());
        cars.add(bc.createCar());
        cars.add(cc.createCar());

        for (Car car : cars) {
            car.showCar();
        }
        fc.attachWheels();
        fc.buildEngine();

        bc.attachWheels();
        bc.buildEngine();

        cc.attachWheels();
        cc.buildEngine();

        for (Car car : cars) {
            car.showCar();
        }
    }

    public static void main(String[] args) {
        ConveyorExample conveyorExample = new ConveyorExample();
    }
}
