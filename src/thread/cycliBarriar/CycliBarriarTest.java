package thread.cycliBarriar;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * CyclicBarrier
 * 创建一个新的CyclicBarrier，当给定数量的参与方（线程）正在等待它时，它将被触发，并且在屏障被触发时不执行预定义的操作。
 */
public class CycliBarriarTest {

    public static final int INT = 5;

    public static void main(String[] args) {

        ExecutorService es = Executors.newFixedThreadPool(5);
        CyclicBarrier cyclicBarrier = new CyclicBarrier(5);
        for (int i = 0; i < INT; i++) {
            Runnable runnable = () -> {
                System.out.println(Thread.currentThread().getName() + "进入线程,线程阻塞中...");
                try {
                    //等待，直到所有各方都调用了此屏障上的wait
                    cyclicBarrier.await();
                    Thread.sleep(2000);
                } catch (InterruptedException | BrokenBarrierException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "线程结束阻塞继续执行");
            };
            es.submit(runnable);
        }
        es.shutdown();
        System.out.println("指令通知完成");
    }
}
