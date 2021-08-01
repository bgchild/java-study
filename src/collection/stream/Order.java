package collection.stream;

public class Order {
    public Order(String name, int num, double price) {
        this.price = price;
        this.name = name;
        this.num = num;
    }

    private double price;
    private String name;
    private int num;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Order{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", num=" + num +
                '}';
    }
}
