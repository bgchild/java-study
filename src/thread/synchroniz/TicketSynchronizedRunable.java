package thread.synchroniz;

/**
 * @author Ann00
 * @date 2020/8/19
 * 同步代码块
 */
public class TicketSynchronizedRunable implements Runnable {
    private int ticket = 100;
    Object lock = new Object();

    @Override
    public void run() {
        synchronized (lock) {
            while (true) {
                if (ticket > 0) {
//                    try {
//                        Thread.sleep(100);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                    String name = Thread.currentThread().getName();
                    System.out.println(name + "正在售卖:" + ticket--);
                } else {
                    break;
                }
            }
        }

    }
}
