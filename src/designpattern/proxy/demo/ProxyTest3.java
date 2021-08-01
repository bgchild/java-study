package designpattern.proxy.demo;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 基于类的动态代理 CGLIB
 */
public class ProxyTest3 {
    public static void main(String[] args) {
        MyProxy3 myProxy3 = new MyProxy3();
        Message2Impl proxy = (Message2Impl) myProxy3.getProxy(Message2Impl.class);
        proxy.send();
    }
}

class MyProxy3 implements MethodInterceptor {

    public Object getProxy(Class clz) {
        Enhancer enhancer = new Enhancer();
        //指定class对象
        enhancer.setSuperclass(clz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    private void before() {
        System.out.println("connected...");
    }

    private void after() {
        System.out.println("closed...");
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        this.before();
        Object invoke = methodProxy.invokeSuper(o, objects);
        this.after();
        return invoke;
    }
}
