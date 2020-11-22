package thread.synchroniz;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Ann00
 * @date 2020/8/19
 */
public class TicketLockRunnable implements Runnable {

    private int ticket = 100;
    ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            lock.lock();
            if (ticket > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                String name = Thread.currentThread().getName();
                System.out.println(name + "正在售卖:" + ticket--);
            }
            lock.unlock();
        }
    }
}
