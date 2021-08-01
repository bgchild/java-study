package ali.collection.stream;

import java.util.Arrays;
import java.util.List;

/**
 * distinct
 * 去重
 *
 * @author laok
 * @date 2021/7/28
 */
public class DistinctTest {
    public static void main(String[] args) {
        final List<Integer> list = Arrays.asList(2, 3, 1, 32, 1, 32);
        list.stream().distinct().forEach(integer -> System.out.println(integer));
    }
}
