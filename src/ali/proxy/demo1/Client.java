package ali.proxy.demo1;

/**
 * @author laok
 * @date 2021/7/30
 */
public class Client {
    public static void main(String[] args) {
        //目标对象
        HelloService target = new HelloServiceImpl();
        //代理对象
        HelloServiceProxy proxy = new HelloServiceProxy(target);
        proxy.say();
    }
}
