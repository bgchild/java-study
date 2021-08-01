package ali.proxy.demo1;

/**
 * @author laok
 * @date 2021/7/30
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public void say() {
        System.out.println("hello world");
    }
}
