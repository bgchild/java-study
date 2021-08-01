package thread.callable;

import java.util.concurrent.*;

/**
 * 取消此任务的执行
 */
public class CancelTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        final ExecutorService es = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            Callable callable = () -> {
                System.out.println(Thread.currentThread().getName() + "==" + finalI);
                return finalI;
            };
            final Future<Integer> submit = es.submit(callable);
            if (i % 2 == 0) {
                submit.cancel(true);
            } else {
                Integer re = submit.get();
                System.out.println(re);
            }
        }
    }
}
