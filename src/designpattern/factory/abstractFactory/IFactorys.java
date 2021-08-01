package designpattern.factory.abstractFactory;

public class IFactorys implements IFactory {
    @Override
    public Product1 createProduct1() {
        return new Product1();
    }

    @Override
    public Product2 createProduct2() {
        return new Product2();
    }
}
