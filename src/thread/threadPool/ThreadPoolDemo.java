package thread.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Ann00
 * @date 2020/8/19
 */
public class ThreadPoolDemo {
    public static void main(String[] args) {
        //创建线程池对象
        ExecutorService es = Executors.newFixedThreadPool(2);
        //创建Runnable实例
        MyRunnable mr = new MyRunnable();
        //自己创建线程对象的方式
        // Thread t = new Thread(r);
        // t.start(); ‐‐‐> 调用MyRunnable中的run()
        // 从线程池中获取线程对象,然后调用MyRunnable中的run()
        es.submit(mr);
        es.submit(mr);
        es.submit(mr);
        // 注意：submit方法调用结束后，程序并不终止，是因为线程池控制了线程的关闭。
        // 将使用完的线程又归还到了线程池中
        // 关闭线程池
        es.shutdown();
    }
}
