package designpattern.builder;

public class CreateBuilder extends Builder {
    private Product product = new Product();

    @Override
    void setPart(String name, String type) {
        product.setName(name);
        product.setType(type);
    }

    @Override
    Product getProduct() {
        return product;
    }
}
