package designpattern.builder;

public abstract class Builder {
    abstract void setPart(String name, String type);

    abstract Product getProduct();
}
