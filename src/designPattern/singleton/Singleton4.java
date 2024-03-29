package designPattern.singleton;

/**
 * 双重检查懒汉式 (可用，推荐)
 *
 * @author laok
 */
public class Singleton4 {
    private static volatile Singleton4 instance = null;

    private Singleton4() {
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
