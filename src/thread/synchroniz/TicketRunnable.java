package thread.synchroniz;

/**
 * @author Ann00
 * @date 2020/8/19
 */
public class TicketRunnable implements Runnable {
    private int ticket = 100;

    @Override
    public void run() {
        boolean s = true;
        while (s) {
            if (ticket > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                String name = Thread.currentThread().getName();
                System.out.println(name + "正在售卖:" + ticket--);
            } else {
                s = false;
            }
        }
    }
}
