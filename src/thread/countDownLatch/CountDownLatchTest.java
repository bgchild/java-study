package thread.countDownLatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * CountDownLatch
 * 1. 让单个线程等待：多个线程(任务)完成后，进行汇总合并
 * 2. 让多个线程等待：模拟并发，让并发线程一起执行
 *
 * @author laok
 */
public class CountDownLatchTest {

    public static void main(String[] args) throws InterruptedException {
        test2();
    }

    /**
     * 等待子线程执行后进行汇总
     *
     * @throws InterruptedException
     */
    public static void test1() throws InterruptedException {
        final ExecutorService es = Executors.newCachedThreadPool();
        final CountDownLatch countDownLatch = new CountDownLatch(5);
        for (int i = 0; i < 5; i++) {
            int finalI = i;
            Runnable runnable = () -> {
                System.out.println(Thread.currentThread().getName() + "---" + finalI + "正在执行");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "---" + finalI + "执行完成！");
                //递减闩锁的计数，如果计数为零，则释放所有等待的线程
                countDownLatch.countDown();

            };
            es.execute(runnable);
        }
        System.out.println("等待子线程执行");
        countDownLatch.await();
        System.out.println("继续执行主线程！");
    }

    /**
     * 模拟并发
     * 让并发线程一起执行
     *
     * @throws InterruptedException
     */
    public static void test2() throws InterruptedException {
        final ExecutorService es = Executors.newCachedThreadPool();
        final CountDownLatch cd = new CountDownLatch(1);
        for (int i = 0; i < 5; i++) {
            int finalI = i;
            Runnable runnable = () -> {
                try {
                    cd.await();
                    System.out.println("等待一并执行：" + finalI);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            };
            es.execute(runnable);
        }
        // 裁判准备发令
        Thread.sleep(2000);
        System.out.println("【Thread-start】.........");
        cd.countDown();
    }
}
