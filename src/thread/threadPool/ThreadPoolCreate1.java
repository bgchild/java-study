package thread.threadPool;

import cn.hutool.core.thread.ThreadFactoryBuilder;

import java.util.concurrent.*;

public class ThreadPoolCreate1 {
    private static final ThreadFactory NAMED_THREAD_FACTORY = new ThreadFactoryBuilder()
            .setNamePrefix("demo-pool-").build();

    public static void main(String[] args) {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(1, 2, 60, TimeUnit.SECONDS, new LinkedBlockingQueue<>(1),NAMED_THREAD_FACTORY, new RejectedExecutionHandler() {
            @Override
            public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
                System.out.println("自定义拒绝策略.....");
                Runnable r1 = r;
                r1.toString();
                System.out.println("当前被拒绝的任务------"+r.toString());
            }
        });

        MyTask task1 = new MyTask(1, "任务1");
        MyTask task2 = new MyTask(2, "任务2");
        MyTask task3 = new MyTask(3, "任务3");
        MyTask task4 = new MyTask(4, "任务4");
        MyTask task5 = new MyTask(5, "任务5");
        MyTask task6 = new MyTask(6, "任务6");

        pool.execute(task1);
        //2、3、4会放到队列
        pool.execute(task2);
        pool.execute(task3);
        pool.execute(task4);
        pool.execute(task5);
        pool.execute(task6);
        pool.shutdown();
    }
}
