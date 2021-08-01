package ali.proxy.demo2;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Cglib实现基于类的动态代理
 *
 * @author laok
 * @date 2021/7/30
 */
public class CglibProxy implements MethodInterceptor {
    private Enhancer enhancer = new Enhancer();

    public Object getProxy(Class clazz) {
        //设置需要创建子类的类
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        //通过字节码技术动态创建子类实例
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("-----------------begin " + method.getName() + "-----------------");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("-----------------end " + method.getName() + "-----------------");
        return result;
    }


    public static void main(String[] args) {
        CglibProxy cglibProxy = new CglibProxy();
        UserServiceImpl userService = (UserServiceImpl) cglibProxy.getProxy(UserServiceImpl.class);
        userService.add();
    }

}
