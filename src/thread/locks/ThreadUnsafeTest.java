package thread.locks;


import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程安全问题
 * @author laok
 */
public class ThreadUnsafeTest {
    public static final int INT = 100;
    private int cnt;

    public void add() {
        cnt++;
    }

    public int get() {
        return cnt;
    }

    public static void main(String[] args) throws InterruptedException {
        final ExecutorService es = Executors.newCachedThreadPool();
        final CountDownLatch cdl = new CountDownLatch(INT);
        ThreadUnsafeTest test = new ThreadUnsafeTest();
        for (int i = 0; i < INT; i++) {
            Runnable ra = () -> {
                test.add();
                cdl.countDown();
            };
            es.execute(ra);
        }
        es.shutdown();
        cdl.await();
        System.out.println(test.get());
    }
}
