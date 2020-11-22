package thread.thread;

/**
 * @author Ann00
 * @date 2020/8/19
 */
public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+i);
        }

    }
}
