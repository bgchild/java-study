package thread.base;

import java.util.concurrent.*;

/**
 * 多线程的三种创建方式
 * 继承Thread（也是实现的Runnable接口）
 * 实现Runnable
 * 实现Callable 具有返回值
 *
 * @author laok
 */
public class MyThreadTest {

    public static final int INT = 20;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //继承Thread
        Thread thread = new MyThread();
        thread.start();
        for (int i = 0; i < INT; i++) {
            System.out.println("MAIN" + i);
        }
        //实现runnable
        MyRunnable mr = new MyRunnable();
        Thread thread2 = new Thread(mr, "run");
        thread2.start();

        //实现callable 具有返回值
        MyCallable mc = new MyCallable();
        final ExecutorService es = Executors.newSingleThreadExecutor();
        final Future<Integer> future = es.submit(mc);
        Integer sum = future.get();
        System.out.println("sum:" + sum);
    }
}
