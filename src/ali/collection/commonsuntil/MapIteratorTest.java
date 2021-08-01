package ali.collection.commonsuntil;


import org.apache.commons.collections4.IterableMap;
import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.map.HashedMap;

/**
 * 因为迭代要在 EntrySet 或 KeySet 对象上完成。
 *
 * @author laok
 * @date 2021/7/28
 */
public class MapIteratorTest {
    public static void main(String[] args) {
        IterableMap<String, String> map = new HashedMap<>();
        map.put("1", "One");
        map.put("2", "Two");
        map.put("3", "Three");
        map.put("4", "Four");
        map.put("5", "Five");
        MapIterator<String, String> iterator = map.mapIterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            Object value = iterator.getValue();
            System.out.println("key: " + key);
            System.out.println("Value: " + value);
            iterator.setValue(value + "_");
        }
        System.out.println(map);
    }
}
