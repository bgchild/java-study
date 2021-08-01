package thread.priority;

import static java.lang.Thread.MAX_PRIORITY;
import static java.lang.Thread.MIN_PRIORITY;

/**
 * 线程的优先级
 *
 * @author laok
 */
public class PriorityTest {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            System.out.println("线程A");
        });
        Thread thread2 = new Thread(() -> {
            System.out.println("线程B");
        });
        Thread thread3 = new Thread(() -> {
            System.out.println("线程C");
        });
        thread3.setPriority(MAX_PRIORITY);
        thread2.setPriority(MAX_PRIORITY);
        thread1.setPriority(MIN_PRIORITY);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
