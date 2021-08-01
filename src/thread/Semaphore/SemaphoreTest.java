package thread.Semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * Semaphore
 * 信号量
 */
public class SemaphoreTest {
    public static void main(String[] args) {

        final ExecutorService es = Executors.newCachedThreadPool();
        final Semaphore semaphore = new Semaphore(2);
        for (int i = 1; i <= 100; i++) {
            Runnable runnable = () -> {
                try {
                    //请求获得许可，如果有可获得的许可则继续往下执行，许可数减1。否则进入阻塞状态
                    semaphore.acquire();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("线程" + Thread.currentThread().getName() + "进入，当前已有" + (semaphore.availablePermits()) + "个并发");
                try {
                    Thread.sleep((2000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("线程" + Thread.currentThread().getName() + "即将离开");
                semaphore.release();//释放许可，许可数加1
                //下面代码有时候执行不准确，因为其没有和上面的代码合成原子单元
                System.out.println("线程" + Thread.currentThread().getName() + "已离开，当前已有" + (semaphore.availablePermits()) + "个并发");
            };
            es.submit(runnable);
        }
        es.shutdown();
    }
}
