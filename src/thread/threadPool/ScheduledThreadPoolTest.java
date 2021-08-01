package thread.threadPool;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/**
 * 计划线程池
 */
public class ScheduledThreadPoolTest {
    public static void main(String[] args) {

        ScheduledThreadPoolExecutor st = new ScheduledThreadPoolExecutor(2);
        for (int i = 0; i < 10; i++) {
            final Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + "创建了一个线程池！");
                }
            };
            final Future<?> submit = st.submit(runnable);
        }
        st.shutdown();
    }
}
