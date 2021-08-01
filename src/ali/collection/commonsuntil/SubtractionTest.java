package ali.collection.commonsuntil;

import org.apache.commons.collections4.CollectionUtils;

import java.util.Arrays;
import java.util.List;

/**
 * subtract
 * 从其他集合中减去一个集合的对象来获取新集合
 *
 * @author laok
 * @date 2021/7/29
 */
public class SubtractionTest {
    public static void main(String[] args) {
        //checking inclusion
        List<String> list1 = Arrays.asList("A", "A", "A", "C", "B", "B");
        List<String> list2 = Arrays.asList("A", "A", "B", "B");
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        System.out.println("List 1 - List 2: "
                + CollectionUtils.subtract(list1, list2));
    }
}
