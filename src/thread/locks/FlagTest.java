package thread.locks;

/**
 * @author laok
 */
public class FlagTest {
    public static boolean flag = true;

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            int i = 1;
            while (flag) {
                try {
                    Thread.sleep(500);
                    System.out.println(Thread.currentThread().getName() + "--" + i++);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        Thread.sleep(2000);
        flag = false;
    }
}
