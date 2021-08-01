package ali.collection.stream;

import java.util.Arrays;
import java.util.List;

/**
 * limit/skip
 * limit 返回 Stream 的前面 n 个元素；skip 则是扔掉前 n 个元素
 *
 * @author laok
 * @date 2021/7/28
 */
public class LimitTest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        numbers.stream().limit(4).skip(2).forEach(System.out::println);
    }
}
