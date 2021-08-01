package designpattern.observer;

public class ConcreteObserver implements Observer {
    @Override
    public void update() {
        System.out.println("ConcreteObserver:作出具体响应");
    }
}
