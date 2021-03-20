package thread.threadPool;


import cn.hutool.core.thread.ThreadFactoryBuilder;

import java.util.concurrent.*;

/**
 * @author laok
 */
public class ThreadPoolCreate {
    private static final ThreadFactory NAMED_THREAD_FACTORY = new ThreadFactoryBuilder()
            .setNamePrefix("demo-pool-").build();

    /**
     * 1、corePoolSize核心线程数大小，当线程数<corePoolSize ，会创建线程执行runnable
     * 2、maximumPoolSize 最大线程数， 当线程数 >= corePoolSize的时候，会把runnable放入workQueue中
     * 3、keepAliveTime  保持存活时间，当线程数大于corePoolSize的空闲线程能保持的最大时间。
     * 4、unit 时间单位
     * 5、workQueue 保存任务的阻塞队列
     * 6、threadFactory 创建线程的工厂
     * 7、handler 拒绝策略
     *
     * @param args
     */
    public static void main(String[] args) {
//        ExecutorService es = newSingleThreadPool();
        ExecutorService es = newFixedThreadPool(2);
        //创建Runnable实例
        MyRunnable mr = new MyRunnable(1);
        es.submit(mr);
        es.submit(mr);
        es.submit(mr);
// 注意：submit方法调用结束后，程序并不终止，是因为线程池控制了线程的关闭。
// 将使用完的线程又归还到了线程池中
// 关闭线程池
        es.shutdown();
    }

    /**
     * newFixedThreadPool()
     * <p>
     * 创建线程数固定大小的线程池。
     * 由于使用了LinkedBlockingQueue所以maximumPoolSize 没用，
     * 当corePoolSize满了之后就加入到LinkedBlockingQueue队列中。
     * 每当某个线程执行完成之后就从LinkedBlockingQueue队列中取一个。所以这个是创建固定大小的线程池
     *
     * @param nThreads
     * @return
     */
    public static ExecutorService newFixedThreadPool(int nThreads) {
        return new ThreadPoolExecutor(nThreads, nThreads,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>());
    }

    /**
     * newSingleThreadPool()
     * 创建线程数为1的线程池，由于使用了LinkedBlockingQueue所以maximumPoolSize
     * 没用，corePoolSize为1表示线程数大小为1,满了就放入队列中，执行完了就从队列取一个。
     *
     * @return
     */
    public static ExecutorService newSingleThreadPool() {
        return new ThreadPoolExecutor(1, 1,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>());

    }

    /**
     * newCachedThreadPool()
     * 创建可缓冲的线程池。没有大小限制。
     * 由于corePoolSize为0所以任务会放入SynchronousQueue队列中，
     * SynchronousQueue只能存放大小为1，所以会立刻新起线程，
     * 由于maxumumPoolSize为Integer.MAX_VALUE所以可以认为大小为2147483647。
     *
     * @return
     */
    public static ExecutorService newCachedThreadPool() {
        return new ThreadPoolExecutor(0, Integer.MAX_VALUE,
                60L, TimeUnit.SECONDS,
                new SynchronousQueue<Runnable>());
    }
}
