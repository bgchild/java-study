package collection.base;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 不可修改
 */
public class UnmodifiableMapTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> unmodifiableMap = Collections.unmodifiableMap(map);
        unmodifiableMap.put("a", 1);
    }
}
