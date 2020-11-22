package thread.threadPool;

public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "创建了一个线程池");
    }
}
