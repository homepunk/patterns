package entity;

import strategy.fly.IFlyBehavior;
import strategy.quack.IQuackBehavior;

public abstract class ADuck {
    private IFlyBehavior flyBehavior;
    private IQuackBehavior quackBehavior;

    protected void setFlyBehavior(IFlyBehavior fly) {
        this.flyBehavior = fly;
    }

    protected void setQuackBehavior(IQuackBehavior quack){
        this.quackBehavior = quack;
    }

    public void quack(){
        quackBehavior.Quacking();
    }

    public void fly() {
        flyBehavior.fly();
    }

    public void swim() {
        System.out.println("I can swim");
    }

    public void move() {
        System.out.println("I can move");
    }

    public abstract void display();

}
