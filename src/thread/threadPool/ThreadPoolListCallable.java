package thread.threadPool;

import java.util.concurrent.Callable;

public class ThreadPoolListCallable implements Callable<Integer> {
    private int i;

    public ThreadPoolListCallable(int i) {
        this.i = i;
    }


    @Override
    public Integer call() throws Exception {
        try {
            Thread.sleep((long) (Math.random() * 1000));
            System.out.println("等待"+i+"---"+(long) (Math.random() * 1000));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i;
    }
}
