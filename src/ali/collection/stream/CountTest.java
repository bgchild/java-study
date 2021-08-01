package ali.collection.stream;

import java.util.Arrays;
import java.util.List;

/**
 * count
 * count 用来统计流中的元素个数
 * @author laok
 * @date 2021/7/28
 */
public class CountTest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        final long count = list.stream().count();
        System.out.println(count);
    }
}
