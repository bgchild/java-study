package designpattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 单例-饿汉式
 */
class Singleton1 {
    public Singleton1() {
        System.out.println("Singleton1实例化");
    }

    private static final Singleton1 INSTANCE = new Singleton1();

    public static Singleton1 getInstance() {
        return INSTANCE;
    }
}

/**
 * 懒汉式-多线程下会有重复创建的问题
 */
class Singleton2 {
    public Singleton2() {
        System.out.println("Singleton2实例化");
    }

    private static Singleton2 instance = null;

    public static Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}

/**
 * 懒汉式 synchronized
 * 同步方法的懒汉式 (可用)
 * 这种写法是对getInstance()加了锁的处理，保证了同一时刻只能有一个线程访问并获得实例，但是缺点也很明显，
 * 因为synchronized是修饰整个方法，每个线程访问都要进行同步，而其实这个方法只执行一次实例化代码就够了，
 * 每次都同步方法显然效率低下，为了改进这种写法，就有了下面的双重检查懒汉式。
 */
class Singleton3 {
    private static Singleton3 instance = null;

    public Singleton3() {
        System.out.println("Singleton3实例化");
    }

    public static synchronized Singleton3 getInstance() {
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }
}

/**
 * 饿汉式
 * 双重检查懒汉式 (可用，推荐)
 */
class Singleton4 {
    private static Singleton4 instance = null;

    public Singleton4() {
        System.out.println("Singleton4实例化");
    }

    public static Singleton4 getInstance() {
        if (instance == null) {
            synchronized (Singleton4.class) {
                if (instance == null) {
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}

/**
 * 饿汉式
 * 静态内部类 (可用，推荐)
 * 这是很多开发者推荐的一种写法，这种静态内部类方式在Singleton类被装载时并不会立即实例化，
 * 而是在需要实例化时，调用getInstance方法，才会装载SingletonInstance类，从而完成对象的实例化。
 * 同时，因为类的静态属性只会在第一次加载类的时候初始化，也就保证了SingletonInstance中的对象只会被实例化一次，并且这个过程也是线程安全的。
 */
class Singleton5 {
    public Singleton5() {
        System.out.println("Singleton5实例化");
    }

    private static class SingletonInner {
        private static Singleton5 singleton5 = new Singleton5();
    }

    public static Singleton5 getInstance() {
        return Singleton5.SingletonInner.singleton5;
    }
}

/**
 * 枚举 (可用、推荐)
 * 1）线程安全问题。因为Java虚拟机在加载枚举类的时候会使用ClassLoader的方法，这个方法使用了同步代码块来保证线程安全。
 * 2）避免反序列化破坏对象，因为枚举的反序列化并不通过反射实现。
 */
enum Singleton6 {
    INSTANCE;

    public void doSomething() {
        System.out.println("doSomething");
    }
}

/**
 * 单例
 *
 * @author laok
 */
public class SingletonTest {
    public static void main(String[] args) throws Exception {
        final ExecutorService executorService = Executors.newCachedThreadPool();

        final Class<Singleton4> singleton4Class = Singleton4.class;
        final Singleton4 singleton4 = singleton4Class.newInstance();
        Field instance = singleton4Class.getDeclaredField("instance");
        instance.setAccessible(true);
        instance.set(singleton4, null);

        for (int i = 0; i < 2; i++) {
            executorService.execute(() -> {
                System.out.println("singleton:" + Singleton4.getInstance());
            });
        }

        final Field field = Singleton6.class.getField("INSTANCE");
        final Singleton6 singleton6 = Singleton6.class.newInstance();
        field.setAccessible(true);
        field.set(singleton6,null);
        System.out.println(field);

    }
}
