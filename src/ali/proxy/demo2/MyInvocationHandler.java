package ali.proxy.demo2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * jdk动态代理
 * 基于接口方式
 *
 * @author laok
 * @date 2021/7/30
 */
public class MyInvocationHandler implements InvocationHandler {
    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("-----------------begin " + method.getName() + "-----------------");
        Object result = method.invoke(target, args);
        System.out.println("-----------------end " + method.getName() + "-----------------");
        return result;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    public static void main(String[] args) {
        UserService us = new UserServiceImpl();
        MyInvocationHandler handler = new MyInvocationHandler(us);
        UserService proxy = (UserService) handler.getProxy();
        proxy.add();
    }
}
