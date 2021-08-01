package collection.map;

/**
 * @author Ann00
 * @date 2020/8/18
 */

import java.util.HashMap;

/**
 * public V put(K key, V value) : 把指定的键与指定的值添加到Map集合中。
 * public V remove(Object key) : 把指定的键 所对应的键值对元素 在Map集合中删除，返回被删除元素的
 * 值。
 * public V get(Object key) 根据指定的键，在Map集合中获取对应的值。
 * public Set<K> keySet() : 获取Map集合中所有的键，存储到Set集合中。
 * public Set<Map.Entry<K,V>> entrySet() : 获取到Map集合中所有的键值对对象的集合(Set集合)。
 */
public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("黄晓明", "杨颖");
        hm.put("文章", "马伊琍");
        hm.put("邓超", "孙俪");
        hm.put("邓超", "sl");
        hm.put(null, "11");
        hm.put("11", null);
        System.out.println(hm);
        hm.remove("文章");
        System.out.println(hm);
        System.out.println(hm.get("黄晓明"));
        System.out.println(hm.keySet());
        System.out.println(hm.entrySet());
    }
}
