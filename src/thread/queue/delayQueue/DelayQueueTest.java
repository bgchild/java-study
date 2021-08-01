package thread.queue.delayQueue;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.TimeUnit;

public class DelayQueueTest {
    public static void main(String[] args) throws InterruptedException {
        Item item1 = new Item(1, "item1", TimeUnit.SECONDS);
        Item item2 = new Item(2, "item2", TimeUnit.SECONDS);
        Item item3 = new Item(3, "item3", TimeUnit.SECONDS);
        final DelayQueue<Item> ds = new DelayQueue<>();
        ds.add(item1);
        ds.add(item2);
        ds.add(item3);
        System.out.println("begin time:" + LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        for (int i = 0; i < 3; i++) {
            final Item take = ds.take();
            System.out.format("name:%s, time:%s\n",take.getName(), LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        }
    }
}
