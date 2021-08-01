package designpattern.builder;

public class Director {
    CreateBuilder createBuilder = new CreateBuilder();

    public Product product1(){
        createBuilder.setPart("宝马x7","宝马");
        return createBuilder.getProduct();
    }

    public Product product2(){
        createBuilder.setPart("奔驰S700","奔驰");
        return createBuilder.getProduct();
    }
}
