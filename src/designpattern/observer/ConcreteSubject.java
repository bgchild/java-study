package designpattern.observer;

public class ConcreteSubject extends Subject {
    @Override
    void notifyObserver() {
        System.out.println("具体对象发生变化...");
        System.out.println("________________");
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
