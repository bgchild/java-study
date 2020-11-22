package thread.synchroniz;

/**
 * @author Ann00
 * @date 2020/8/19
 */
public class TicketSellDemo2 {
    public static void main(String[] args) {
        TicketSynchronizedRunable2 tr = new TicketSynchronizedRunable2();
        Thread thread1 = new Thread(tr,"窗口1");
        Thread thread2 = new Thread(tr,"窗口2");
        Thread thread3 = new Thread(tr,"窗口3");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
