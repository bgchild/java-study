package thread.threadPool;

import java.util.concurrent.*;

/**
 * 线程池参数
 *
 * @author laok
 */
public class ThreadPoolTest {
    public static void main(String[] args) {
        /**
         * 线程池的7个参数
         * int corePoolSize (核心线程数)
         * int maximumPoolSize （最大线程数）
         * long keepAliveTime （空闲等待时间）
         * TimeUnit unit （回收时间单位）
         * BlockingQueue<Runnable> workQueue （存储等待队列）
         * ThreadFactory threadFactory (创建新线程的工厂)
         * RejectedExecutionHandler handler （拒绝策略）
         * 最大执行数
         * 最大执行数 = 最大线程数+队列容量
         * 执行过程：
         * 创建核corePoolSize的线程执行任务、装满workQueue、创建队列执行任务直到poolSize为maximumPoolSize
         */
        BlockingQueue<Runnable> workQueue = new LinkedBlockingDeque<>(20);
        ThreadFactory tf = r -> new Thread(r, "pool-");
        RejectedExecutionHandler re = (r, executor) -> System.out.println("自定义拒绝策略.....");
        ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 60L, TimeUnit.SECONDS, workQueue, tf, re);
        for (int i = 0; i < 100; i++) {
            int finalI = i;
            Runnable runnable = () -> {
                System.out.println(Thread.currentThread().getName() + "任务" + finalI);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            };
            System.out.println("当前线程数：" + executor.getPoolSize());
            System.out.println("队列：" + executor.getQueue().size());
            executor.execute(runnable);
        }
    }
}
