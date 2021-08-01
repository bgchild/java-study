package thread.yield;

/**
 * @author laok
 * 线程礼让
 */
public class YieldTest {

    public static final int INT = 20;

    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < INT; i++) {
                if (i % 2 == 0) {
                    Thread.yield();
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "-" + i + "-子线程执行");
            }

        });

        thread.start();

        for (int i = 0; i < INT; i++) {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + "主线程执行");
        }
    }
}
