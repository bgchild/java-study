package thread.queue.LinkedTransferQueue;

import java.util.concurrent.LinkedTransferQueue;

/**
 * LinkedTransferQueue
 */
public class LinkedTransferQueueTest {
    public static void main(String[] args) {
        final LinkedTransferQueue<Integer> ltq = new LinkedTransferQueue<>();
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            new Thread(() -> {
                ltq.put(finalI);
            },"Thread-put-").start();
        }

        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                try {
                    final Integer take = ltq.take();
                    System.out.println(Thread.currentThread().getName() + "线程消费" + take);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            },"Thread-take-").start();
        }

    }
}
