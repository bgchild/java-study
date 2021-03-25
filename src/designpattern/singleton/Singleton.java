package designpattern.singleton;

/**
 * @author laok
 * 饿汉式
 * 浪费内存
 */
public class Singleton {

    private Singleton() {
    }

    private static final Singleton INSTANCE = new Singleton();

    public static Singleton getInstance() {
        return INSTANCE;
    }
}
