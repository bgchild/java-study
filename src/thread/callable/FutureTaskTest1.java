package thread.callable;

import java.util.concurrent.*;

/**
 * @author laok
 */
public class FutureTaskTest1 {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, FutureTask<String>> cm = new ConcurrentHashMap<>(10);
        ExecutorService es = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            FutureTask ft = new FutureTask<>(() -> Thread.currentThread().getName() + "-" + finalI);
            es.submit(ft);
            cm.putIfAbsent(i, ft);
        }
        es.shutdown();
        cm.forEach((key, value) -> {
            System.out.println(key);
            try {
                System.out.println(value.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        });
    }
}
