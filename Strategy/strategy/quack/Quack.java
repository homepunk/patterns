package strategy.quack;

public class Quack implements IQuackBehavior {

    @Override
    public void Quacking() {
        System.out.println("I'm quacking like a normal duck");
    }
}
