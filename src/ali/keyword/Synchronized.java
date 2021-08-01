package ali.keyword;

/**
 * @author laok
 * @date 2021/8/1
 */
public class Synchronized {
    /**
     * 同步方法
     */
    public synchronized void doSth() {
        System.out.println("Hello World");
    }

    /**
     * 同步代码块
     */
    public void doSth1() {
        synchronized (Synchronized.class) {
            System.out.println("Hello World");
        }
    }
}
