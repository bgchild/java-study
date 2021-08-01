package designpattern.builder;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        final Product product = director.product1();
        product.showProduct();
    }
}
