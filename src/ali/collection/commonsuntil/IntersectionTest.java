package ali.collection.commonsuntil;

import org.apache.commons.collections4.CollectionUtils;

import java.util.Arrays;
import java.util.List;

/**
 * intersection
 * 获取两个集合（交集）
 *
 * @author laok
 * @date 2021/7/29
 */
public class IntersectionTest {
    public static void main(String[] args) {
        //checking inclusion
        List<String> list1 = Arrays.asList("A", "A", "A", "C", "B", "B");
        List<String> list2 = Arrays.asList("A", "A", "D", "B");
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        System.out.println("Commons Objects of List 1 and List 2: "
                + CollectionUtils.intersection(list1, list2));
    }
}
