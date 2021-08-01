package jvm.classLoader;

import java.lang.reflect.Method;

/**
 * @author laok
 */
public class ClassLoaderTest {
    public static void main(String[] args) throws Exception {
        MyClassLoader myClassLoader = new MyClassLoader();
        final Class<?> aClass = myClassLoader.loadClazz("jvm.classLoader.Message");
        System.out.println("-1-：" + aClass.getClassLoader());
        System.out.println("-2-：" + aClass.getClassLoader().getParent());
        System.out.println("-3-：" + aClass.getClassLoader().getParent().getParent());
        final Object o = aClass.newInstance();
        final Method send = aClass.getMethod("send");
        send.invoke(o);
    }
}
