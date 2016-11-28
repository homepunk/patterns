package entity;

import strategy.fly.FlyNoWay;
import strategy.quack.Squeak;

public class RubberDuck extends ADuck{

    public RubberDuck(){
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new Squeak());
    }

    @Override
    public void display() {
        System.out.println("I'm a rubber duck");
    }
}
