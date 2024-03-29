package designPattern.singleton;

/**
 * 同步方法的懒汉式 (可用)
 * 这种写法是对getInstance()加了锁的处理，保证了同一时刻只能有一个线程访问并获得实例，但是缺点也很明显，
 * 因为synchronized是修饰整个方法，每个线程访问都要进行同步，而其实这个方法只执行一次实例化代码就够了，
 * 每次都同步方法显然效率低下，为了改进这种写法，就有了下面的双重检查懒汉式。
 */
public class Singleton3 {
    private static Singleton3 instance = null;

    private Singleton3() {

    }

    public static synchronized Singleton3 getInstance() {
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }
}
