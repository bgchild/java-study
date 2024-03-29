package designPattern.singleton;

/**
 * 静态内部类 (可用，推荐)
 * 这是很多开发者推荐的一种写法，这种静态内部类方式在Singleton类被装载时并不会立即实例化，
 * 而是在需要实例化时，调用getInstance方法，才会装载SingletonInstance类，从而完成对象的实例化。
 * 同时，因为类的静态属性只会在第一次加载类的时候初始化，也就保证了SingletonInstance中的对象只会被实例化一次，并且这个过程也是线程安全的。
 */
public class Singleton5 {
    private Singleton5() {
    }

    private static class SingletonInstance {
        public static final Singleton5 INSTANCE = new Singleton5();
    }

    public static Singleton5 getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
