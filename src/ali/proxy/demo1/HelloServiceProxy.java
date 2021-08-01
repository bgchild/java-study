package ali.proxy.demo1;

/**
 * @author laok
 * @date 2021/7/30
 */
public class HelloServiceProxy implements HelloService {
    private HelloService target;

    public HelloServiceProxy(HelloService target) {
        this.target = target;
    }

    @Override
    public void say() {
        //方法的增强
        System.out.println("记录日志");
        target.say();
        System.out.println("清理数据");
    }
}
