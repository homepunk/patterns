package entity;

import strategy.fly.FlyWithWings;
import strategy.quack.Quack;

public class ReadHeadDuck extends ADuck {

    public ReadHeadDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm a Readhead duck");
    }
}
