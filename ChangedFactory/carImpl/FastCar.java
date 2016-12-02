package carImpl;

import car.Car;

public class FastCar extends Car {
    private String engine = "No engine";

    @Override
    public void buildEngine() {
        this.engine = "Fast car engine installed";
    }

    public void showCar() {
        System.out.println(engine + "\nFast car has " + wheels + " wheels\n\n");
    }
}
