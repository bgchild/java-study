package designpattern.strategy;

public class ConcreteStrategy1 implements IStrategy{
    @Override
    public void doSomething() {
        System.out.println("ConcreteStrategy1：具体策略1");
    }
}
