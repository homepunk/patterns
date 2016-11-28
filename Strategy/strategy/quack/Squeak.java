package strategy.quack;

public class Squeak implements IQuackBehavior {

    @Override
    public void Quacking() {
        System.out.println("I can't quack, but i can squeak");
    }
}
