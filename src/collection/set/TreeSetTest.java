package collection.set;

import java.util.TreeSet;

/**
 * @author laok
 */
public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>((o1, o2) -> o2 - o1);
        ts.add(1);
        ts.add(5);
        ts.add(3);
        ts.add(4);
        for (Integer t : ts) {
            System.out.println(t);
        }
    }
}
