package thread.join;

/**
 * Waits for this thread to die
 */
public class JoinTest {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println(Thread.currentThread().getName() + "--" + i);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + "执行完毕！");
        }, "子线程");
        thread.start();
        //等待子线程执行完毕后执行主线程
        thread.join();
        for (int i = 0; i < 10; i++) {
            System.out.println("主线程" + i);
        }
    }
}
