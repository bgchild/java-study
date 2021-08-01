package thread.locks;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Atomic
 * 可以原子更新保证线程安全
 */
public class AtomicTest {
    private AtomicInteger cnt = new AtomicInteger();

    public void add() {
        cnt.incrementAndGet();
    }

    private int get() {
        return cnt.get();
    }

    public static void main(String[] args) throws InterruptedException {
        int nThreads = 1000;
        final CountDownLatch countDownLatch = new CountDownLatch(nThreads);
        final AtomicTest atomicTest = new AtomicTest();
        final ThreadPoolExecutor executor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new LinkedBlockingDeque<>());
        for (int i = 0; i < nThreads; i++) {
            executor.execute(() -> {
                atomicTest.add();
                countDownLatch.countDown();
            });
        }

        countDownLatch.await();
        System.out.println(atomicTest.get());
    }
}
