package designpattern.factory.abstractFactory;

public class Client {
    public static void main(String[] args){
        IFactory factory = new IFactorys();
        factory.createProduct1().show();
        factory.createProduct2().show();
    }
}
