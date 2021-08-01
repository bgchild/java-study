package thread.waitAndNotify;

/**
 * 使用wait(long m)方法
 * wait方法如果在毫秒值结束之后,还没有被notify唤醒,就会自动醒来,线程睡醒进入到Runnable/Blocked状态
 * 唤醒的方法:
 * void notify() 唤醒在此对象监视器上等待的单个线程。
 * void notifyAll() 唤醒在此对象监视器上等待的所有线程。
 *
 * @author laok
 */
public class WaitAndNotify {
    private static Object object = new Object();

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                synchronized (object) {
                    try {
                        System.out.println(Thread.currentThread().getName() + "：获取到锁对象，调用wait方法，进入waiting状态，释放锁对象");
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "：从waiting状态醒来，获取到锁对象，继续执行了");
                }
            }, "等待线程" + i).start();

            new Thread(() -> {
                synchronized (object) {
                    System.out.println(Thread.currentThread().getName() + "：获取到锁对象，调用notify方法，释放锁对象");
                    object.notifyAll();
                }
            }, "唤醒线程" + i).start();
        }
    }
}
