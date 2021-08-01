package thread.daemon;

/**
 * 守护线程
 * 任何一个守护线程都会守护整个JVM中所有的非守护线程，
 * 只要当前JVM中还有任何一个非守护线程没有结束，守护线程就全部工作，
 * 当所有的非守护线程全部结束后，守护线程也会随着JVM一同结束
 */
public class DaemonTest {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("普通线程" + i);

            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("守护线程" + i);
            }
        });
        thread2.setDaemon(true);
        thread1.start();
        thread2.start();
        Thread.sleep(1000);
    }
}



