package thread.base;

/**
 * 继承Thread
 * 重写run方法
 *
 * @author laok
 */
public class MyThread extends Thread {
    private final static int INN = 20;

    @Override
    public void run() {
        for (int i = 0; i < INN; i++) {
            System.out.println(Thread.currentThread().getName() + "----" + i);
        }
    }
}
