package colation.list.hashSet;

import java.util.HashSet;

/**
 * @author Ann00
 * @date 2020/8/18
 * 集合不能出现重复元素
 */
public class hashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("abc1");
        hs.add("abc1");
        hs.add("abc2");
        hs.add("abc3");
        for (String item: hs) {
            System.out.println(item);
        }
    }
}
