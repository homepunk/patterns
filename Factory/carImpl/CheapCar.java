package carImpl;

import car.Car;

public class CheapCar extends Car {
    private String engine = "No engine";

    @Override
    public void buildEngine() {
        this.engine = "Cheap car engine installed";
    }

    public void showCar() {
        System.out.println(engine + "\nCheap car has " + wheels + " wheels\n\n");
    }
}
