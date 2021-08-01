package designpattern.observer;

public class Concrete2Observer implements Observer{
    @Override
    public void update() {
        System.out.println("Concrete2Observer:作出具体响应");
    }
}
