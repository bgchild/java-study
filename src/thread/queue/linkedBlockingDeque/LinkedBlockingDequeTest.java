package thread.queue.linkedBlockingDeque;

import java.util.concurrent.LinkedBlockingDeque;

/**
 * LinkedBlockingDeque
 */
public class LinkedBlockingDequeTest {
    public static void main(String[] args) throws InterruptedException {
        final LinkedBlockingDeque<String > strings = new LinkedBlockingDeque<>();
        strings.addFirst("first");
        strings.addLast("last");
        System.out.println(strings.takeFirst());
        System.out.println(strings.takeLast());
    }
}
