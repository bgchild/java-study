package ali.serializable.demo6;

import java.io.Serializable;

/**
 * 单例 双重入锁
 *
 * @author laok
 * @date 2021/7/31
 */
public class Singleton implements Serializable {
    public volatile static Singleton singleton;

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    private Object readResolve() {
        return singleton;
    }
}
