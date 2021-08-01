package thread.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * 消费者模型
 *
 * @author laok
 */
public class ProducerConsumerTest {
    private static BlockingQueue<String> blockingQueue = new ArrayBlockingQueue(5);

    static class Producer implements Runnable {
        @Override
        public void run() {
            try {
                blockingQueue.put("producer...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("producer：put-produce...");
        }
    }

    static class Consumer implements Runnable {

        @Override
        public void run() {
            String take = null;
            try {
                take = blockingQueue.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("consumer: take-" + take);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Producer producer = new Producer();
            new Thread(producer).start();
        }
        for (int i = 0; i < 10; i++) {
            Consumer consumer = new Consumer();
            new Thread(consumer).start();
        }

    }
}
