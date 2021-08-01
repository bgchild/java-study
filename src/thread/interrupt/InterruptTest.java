package thread.interrupt;

/**
 * interrupt 线程中断
 * isInterrupted 测试线程是否已中断
 */
public class InterruptTest {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            boolean stop = false;
            while (!stop) {
                System.out.println(Thread.currentThread().getName() + " is running");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("week up from block...");
                    // 在异常处理代码中修改共享变量的状态
                    stop = true;
                }
            }
            System.out.println(Thread.currentThread().getName() + " is exiting...");
        });
        thread.start();
        Thread.sleep(3000);
        if (!thread.isInterrupted()) {
            thread.interrupt();
            System.out.println("bye bye...");
        }
    }
}
