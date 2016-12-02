package car;

public abstract class Car {
    protected int wheels = 0;
    protected int windows = 0;

    public abstract void buildEngine();

    public void attachWheels() {
        this.wheels = 4;
    }

    public void installWindows() {
        this.windows = 5;
    }

    public abstract void carPaint();

    public abstract void showCar();
}
