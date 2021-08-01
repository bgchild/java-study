package collection.map;

import java.util.Hashtable;

/**
 * Hashtable
 * 同步线程安全
 * key、value 不允许为null
 */
public class HashTableTest {
    public static void main(String[] args) {
        Hashtable hs = new Hashtable<>();
        hs.put("1", "1");
    }
}
