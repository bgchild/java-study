package ali.ioc;

public class Client {
    public static void main(String[] args) throws Exception {
        Furit furit = Factory.getInstance("LeetCode.ioc.Apple");
        furit.eat();
        Furit furit2 = Factory.getInstance("LeetCode.ioc.Orange");
        furit2.eat();
    }
}
