package realisation;

import entity.ReadHeadDuck;
import entity.RubberDuck;
import entity.ToyDuck;

public class Context {
    public static void main(String[] args) {
        RubberDuck rDuck = new RubberDuck();
        ToyDuck tDuck = new ToyDuck();
        ReadHeadDuck rhDuck = new ReadHeadDuck();
        rDuck.display();
        rDuck.move();
        rDuck.swim();
        rDuck.fly();
        rDuck.quack();
        System.out.println();
        tDuck.display();
        tDuck.move();
        tDuck.swim();
        tDuck.fly();
        tDuck.quack();
        System.out.println();
        rhDuck.display();
        rhDuck.move();
        rhDuck.swim();
        rhDuck.fly();
        rhDuck.quack();
    }
}
