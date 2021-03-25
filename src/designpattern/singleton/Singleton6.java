package designpattern.singleton;

import java.lang.reflect.Constructor;

/**
 * 枚举 (可用、推荐)
 * 1）线程安全问题。因为Java虚拟机在加载枚举类的时候会使用ClassLoader的方法，这个方法使用了同步代码块来保证线程安全。
 * 2）避免反序列化破坏对象，因为枚举的反序列化并不通过反射实现。
 */
public enum Singleton6 {
    INSTANCE;

    public void doSomething() {
        System.out.println("doSomething");
    }

    public static void main(String[] args) throws Exception{
        Constructor<Singleton6> declaredConstructor = Singleton6.class.getDeclaredConstructor(String.class,int.class);
        Singleton6 singleton6 = declaredConstructor.newInstance();
       // Singleton6 singleton7 = declaredConstructor.newInstance();
        System.out.println(singleton6);
       // System.out.println(singleton7);
    }
}
