package jvm.testDeadLock;

/**
 * @author Ann00
 * @date 2020/8/23
 */
public class DeadLockTest {
    private static Object obj1 = new Object();
    private static Object obj2 = new Object();

    public static void main(String[] args) {

        Thread thread1 = new Thread(new thread1());

        Thread thread2 = new Thread(new thread2());

        thread1.start();
        thread2.start();
    }

    public static class thread1 implements Runnable {
        @Override
        public void run() {
            synchronized (obj1) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (obj2) {
                    System.out.println("thread1拿到obj2锁");
                }
            }

        }
    }

    public static class thread2 implements Runnable {
        @Override
        public void run() {
            synchronized (obj2) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (obj1) {
                    System.out.println("thread2拿到obj1锁");
                }
            }

        }
    }
}
