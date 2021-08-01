package designpattern.proxy.demo;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 基于接口的动态代理
 *
 * @author laok
 */
public class ProxyTest2 {
    public static void main(String[] args) throws Throwable {
        final Message2 message = Factory.getInstance(Message3Impl.class);
        message.send();

    }
}

interface Message2 {
    void send();
}

class Message2Impl implements Message2 {
    @Override
    public void send() {
        System.out.println("send a message..");
    }
}

class Message3Impl implements Message2 {
    @Override
    public void send() {
        System.out.println("send messages..");
    }
}

class MyProxy2 implements InvocationHandler {
    private Object target;

    public Object bind(Object t) {
        this.target = t;
        return Proxy.newProxyInstance(t.getClass().getClassLoader(), t.getClass().getInterfaces(), this);
    }

    private void before() {
        System.out.println("connected...");
    }

    private void after() {
        System.out.println("closed...");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        this.before();
        final Object invoke = method.invoke(this.target, args);
        this.after();
        return invoke;
    }
}

class Factory {
    public static <T> T getInstance(Class<T> t) throws Exception {
        T bind = (T) new MyProxy2().bind(t.getDeclaredConstructor().newInstance());
        return bind;
    }
}
