package thread.queue.blockingQueue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.*;

/**
 * BlockingQueue
 * @author laok
 */
public class BlockingQueueTest {
    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(10, true);
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue<>();
        PriorityBlockingQueue priorityBlockingQueue = new PriorityBlockingQueue<>();
        DelayQueue delayQueue = new DelayQueue<>();
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        LinkedTransferQueue linkedTransferQueue = new LinkedTransferQueue<>();
        LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque<>();

        Collection<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        linkedBlockingQueue.add(3);
        //将linkedBlockingQueue排放至arrayList
        linkedBlockingQueue.drainTo(arrayList);
        System.out.println("arrayList:" + arrayList);
        System.out.println("linkedBlockingQueue:" + linkedBlockingQueue);

        //在该队列的尾部插入指定的元素
        final boolean offer = linkedBlockingQueue.offer(2, 10, TimeUnit.SECONDS);
        System.out.println("linkedBlockingQueue:" + linkedBlockingQueue);
        System.out.println(offer);
    }
}
