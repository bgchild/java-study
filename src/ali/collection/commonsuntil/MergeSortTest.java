package ali.collection.commonsuntil;

import org.apache.commons.collections4.CollectionUtils;

import java.util.Arrays;
import java.util.List;

/**
 * collate
 * 合并并排序
 *
 * @author laok
 * @date 2021/7/29
 */
public class MergeSortTest {
    public static void main(String[] args) {
        List<String> sortedList1 = Arrays.asList("A", "C", "E");
        List<String> sortedList2 = Arrays.asList("B", "D", "F");
        final List<String> collate = CollectionUtils.collate(sortedList1, sortedList2);
        System.out.println(collate);
    }
}
