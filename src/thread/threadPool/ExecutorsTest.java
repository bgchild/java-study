package thread.threadPool;

import java.util.concurrent.*;

import static java.util.concurrent.TimeUnit.NANOSECONDS;

/**
 * Executors工具类创建线程
 *
 * @author laok
 */
public class ExecutorsTest {
    public static void main(String[] args) {
        //单线程
        ExecutorService st = Executors.newSingleThreadExecutor();
        ThreadPoolExecutor st1 = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());

        //创建固定线程数
        int nThreads = 5;
        ExecutorService ft = Executors.newFixedThreadPool(nThreads);
        ThreadPoolExecutor ft1 = new ThreadPoolExecutor(nThreads, nThreads, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());

        //可回收线程（六十秒未使用的线程将被终止并从缓存中删除）
        ExecutorService ct = Executors.newCachedThreadPool();
        ThreadPoolExecutor ct1 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue<>());

        //计划线程池
        ScheduledExecutorService sct = Executors.newScheduledThreadPool(nThreads);
        ScheduledExecutorService sct1 = new ScheduledThreadPoolExecutor(nThreads);

        //创建单个计划线程池
        ScheduledExecutorService sst = Executors.newSingleThreadScheduledExecutor();
        ScheduledExecutorService sst1 = new ScheduledThreadPoolExecutor(1);

        sst.schedule(() -> {
            System.out.println("延时3秒后执行");
            System.out.println(Thread.currentThread().getName());
        }, 3, TimeUnit.SECONDS);

        sst.scheduleAtFixedRate(()->{
            System.out.println("延时3秒后每隔1s执行！");
        },3,1,TimeUnit.SECONDS);
    }
}
