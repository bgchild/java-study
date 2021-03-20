package designPattern.singleton;

/**
 * 懒汉式
 * 线程不安全，不可用
 * @author laok
 */
public class Singleton2 {
    private Singleton2() {
        System.out.println(Thread.currentThread().getName() + "ok");
    }

    private static Singleton2 instance = null;

    public static Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}
