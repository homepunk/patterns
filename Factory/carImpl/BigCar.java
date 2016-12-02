package carImpl;

import car.Car;

public class BigCar extends Car {
    private String engine = "No engine";

    @Override
    public void buildEngine() {
        this.engine = "Big car engine installed";
    }

    public void showCar() {
        System.out.println(engine + "\nBig car has " + wheels + " wheels\n\n");
    }
}
