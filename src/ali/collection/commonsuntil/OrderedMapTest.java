package ali.collection.commonsuntil;

import org.apache.commons.collections4.map.LinkedMap;

/**
 * OrderedMap 是地图的新接口，用于保留添加元素的顺序
 * @author laok
 * @date 2021/7/29
 */
public class OrderedMapTest {
    public static void main(String[] args) {
        final LinkedMap<String, String> map = new LinkedMap<>();
        map.put("One", "1");
        map.put("Two", "2");
        map.put("Three", "3");
        System.out.println(map.firstKey());
        System.out.println(map.nextKey("One"));
        System.out.println(map.nextKey("Two"));
    }
}
