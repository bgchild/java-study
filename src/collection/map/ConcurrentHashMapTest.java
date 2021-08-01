package collection.map;

import java.util.concurrent.ConcurrentHashMap;

/**
 * ConcurrentHashMap
 * 线程安全的用来提到HashTable
 */
public class ConcurrentHashMapTest {
    public static void main(String[] args) {
        final ConcurrentHashMap<String, String> ch = new ConcurrentHashMap<>();
        ch.put("1", "");
    }
}
