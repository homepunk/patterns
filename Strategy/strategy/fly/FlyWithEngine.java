package strategy.fly;

public class FlyWithEngine implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with engine");
    }
}
