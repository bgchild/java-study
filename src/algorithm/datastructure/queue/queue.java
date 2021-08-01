package algorithm.datastructure.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 队列（queue）
 */
public class queue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("1");
        queue.add("2");

        queue.remove();
        queue.offer("3");
        queue.add("4");
        System.out.println(queue);
    }
}
