package designpattern.strategy;

public class Client {
    public static void main(String[] args) {
        final ConcreteStrategy2 concreteStrategy1 = new ConcreteStrategy2();
        final Context context = new Context(concreteStrategy1);
        context.execute();
    }
}
