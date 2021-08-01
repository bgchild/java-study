package collection.map;

import java.util.*;

public class TreeMapTest {
    public static void main(String[] args) {
        //升序排序
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("mm", 18);
        tm.put("xx", 19);
        tm.put("aa", 19);
        List<Map.Entry<String, Integer>> list = new ArrayList<>(tm.entrySet());
        list.sort((o1, o2) -> o2.getValue() - o1.getValue());
        for (Map.Entry<String, Integer> se : list) {
            System.out.println(se.getKey() + ":" + se.getValue());
        }
    }
}
