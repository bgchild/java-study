package ali.reflect.demo;

/**
 * @author laok
 * @date 2021/7/29
 */
public class Client {
    public static void main(String[] args) throws Exception {
        Fruit apple = FactoryReflect.getInstance("leetCode.reflect.demo.Orange");
        apple.eat();
    }
}
