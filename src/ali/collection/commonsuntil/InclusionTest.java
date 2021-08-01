package ali.collection.commonsuntil;

import org.apache.commons.collections4.CollectionUtils;

import java.util.Arrays;
import java.util.List;

/**
 * isSubCollection
 * 检查列表是否是另一个列表的一部分
 * @author laok
 * @date 2021/7/29
 */
public class InclusionTest {
    public static void main(String[] args) {
        //checking inclusion
        List<String> list1 = Arrays.asList("A", "A", "A", "C", "B", "B");
        List<String> list2 = Arrays.asList("A", "B", "B", "B");
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        System.out.println("Is List 2 contained in List 1: "
                + CollectionUtils.isSubCollection(list2, list1));
    }
}
