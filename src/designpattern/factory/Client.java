package designpattern.factory;

public class Client {
    public static void main(String[] args) {
        final Factory factory = new Factory();
        factory.createCar();
    }
}
