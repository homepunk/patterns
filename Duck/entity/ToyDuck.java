package entity;

import strategy.fly.FlyNoWay;
import strategy.quack.MuteQuack;

public class ToyDuck extends ADuck {

    public ToyDuck(){
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }

    @Override
    public void display(){
        System.out.println("I'm a toy duck");
    }
}
