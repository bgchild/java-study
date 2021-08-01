package thread.volatiles;

public class VolatileTest {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            private volatile int tickets = 100;

            @Override
            public synchronized void run() {
                while (tickets > 0) {
                    System.out.println(Thread.currentThread().getName() + "==" + tickets);
                    tickets--;

                }
            }
        };

        final Thread thread1 = new Thread(r, "窗口1");
        final Thread thread2 = new Thread(r, "窗口2");

        thread1.start();
        thread2.start();
    }

}
