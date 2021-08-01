package leetcode.generics.demo1;

import org.apache.commons.collections4.map.HashedMap;

/**
 * @author laok
 * @date 2021/7/29
 */
public class Test {
    public static void main(String[] args) {
        HashedMap<String, String> map = new HashedMap<>();
        map.put("mm", "18");
        map.put("dd", "19");
        System.out.println(map.get("mm"));
        System.out.println(map.get("dd"));
    }
}
