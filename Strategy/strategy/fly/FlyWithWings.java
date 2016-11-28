package strategy.fly;

public class FlyWithWings implements IFlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying with wings");
    }
}
