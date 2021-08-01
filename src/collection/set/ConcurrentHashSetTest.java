package collection.set;

import cn.hutool.core.collection.ConcurrentHashSet;

/**
 * ConcurrentHashSet
 * 同步线程线程安全
 */
public class ConcurrentHashSetTest {
    public static void main(String[] args) {
        final ConcurrentHashSet<String> ch = new ConcurrentHashSet<>();
        ch.add("张3");
        ch.add("李4");
        ch.add("李4");
        ch.add(null);
        for (String s : ch) {
            System.out.println(s);
        }
    }
}
