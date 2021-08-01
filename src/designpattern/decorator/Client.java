package designpattern.decorator;

public class Client {
    public static void main(String[] args) {
        Man man = new NormalMan("张三");
        Man man1 = new CarDecorImpl(man);
        Man man2 = new HouseDecorImpl(man1);
        System.out.println("层层装饰：");
        man2.getManDesc();
        System.out.println("\n重复装饰：");
        Man man3 = new HouseDecorImpl(man2);
        man3.getManDesc();
        System.out.println("\n任意装饰：");
        Man man4 = new HouseDecorImpl(man);
        man4.getManDesc();
    }
}
