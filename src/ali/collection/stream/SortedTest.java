package ali.collection.stream;

import java.util.Arrays;
import java.util.List;

/**
 * sorted
 * 对流进行排序
 *
 * @author laok
 * @date 2021/7/28
 */
public class SortedTest {
    public static void main(String[] args) {
        final List<Integer> list = Arrays.asList(2, 3, 1, 32, 1, 32);
        list.stream().sorted().forEach(System.out::println);
    }
}
