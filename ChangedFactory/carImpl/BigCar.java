package carImpl;

import car.Car;

public class BigCar extends Car {
    private String engine = "No engine";
    private String color = "none";

    @Override
    public void buildEngine() {
        this.engine = "Big car engine installed";
    }

    @Override
    public void carPaint() {
        this.color = "VELVET";
    }

    public void showCar() {
        System.out.println(engine + "\nBig car has " + wheels + " wheels\n" + windows + " windows was installed\nCar was painted in " + color
                + " color\nYour car is ready\n\n" );
    }
}
