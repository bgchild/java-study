package designpattern.singleton;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Singleton7 {
    private static boolean f = false;

    private Singleton7() {
        if (!f) {
            f = true;
        } else {
            throw new RuntimeException("不要试图用反射破解！");
        }

    }

    private static volatile Singleton7 instance = null;

    public static Singleton7 getInstance() {
        if (instance == null) {
            synchronized (Singleton4.class) {
                if (instance == null) {
                    instance = new Singleton7();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) throws Exception {
        Field f = Singleton7.class.getDeclaredField("f");
        f.setAccessible(true);
        Constructor<Singleton7> declaredConstructor = Singleton7.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Singleton7 singleton1 = declaredConstructor.newInstance();
        f.set(singleton1, false);
        Singleton7 singleton2 = declaredConstructor.newInstance();
        System.out.println(singleton1);
        System.out.println(singleton2);
    }
}
