package car;

public abstract class Car {
    protected int wheels = 0;
    public abstract void buildEngine();

    public void attachWheels(){
        this.wheels = 4;
    }

    public abstract void showCar();
}
