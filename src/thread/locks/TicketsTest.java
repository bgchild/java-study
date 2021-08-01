package thread.locks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 多线程卖票
 * 超卖
 *
 * @author laok
 */
public class TicketsTest {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            private int tickets = 10;

            @Override
            public synchronized void run() {
                if (tickets > 0) {
                    System.out.println(Thread.currentThread().getName() + "：" + tickets);
                    tickets--;
                }
            }
        };
        ExecutorService es = Executors.newCachedThreadPool();
        for (int i = 0; i < 1000; i++) {
            es.execute(runnable);
        }
    }
}

