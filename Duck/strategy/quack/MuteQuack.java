package strategy.quack;

public class MuteQuack implements IQuackBehavior {

    @Override
    public void Quacking() {
        System.out.println("I can't quack");
    }
}
