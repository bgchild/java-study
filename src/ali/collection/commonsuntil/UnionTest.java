package ali.collection.commonsuntil;

import org.apache.commons.collections4.CollectionUtils;

import java.util.Arrays;
import java.util.List;

/**
 * union
 * 用于获取两个集合的并集
 *
 * @author laok
 * @date 2021/7/29
 */
public class UnionTest {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("A", "A", "A", "C", "B", "B");
        List<String> list2 = Arrays.asList("A", "A", "B", "B");
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        System.out.println("Union of List 1 and List 2: "
                + CollectionUtils.union(list1, list2));
    }
}
