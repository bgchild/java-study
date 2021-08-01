package thread.sleep;

/**
 * sleep关键字
 * 线程休眠
 * 模拟记时
 *
 * @author laok
 */
public class SleepTest {

    public static final int INT = 60;

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 1; i <= INT; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i);
            }
        });
        thread.start();
    }
}
