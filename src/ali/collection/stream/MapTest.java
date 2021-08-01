package ali.collection.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * map
 * map方法用于映射每个元素到对应的结果
 *
 * @author laok
 * @date 2021/7/28
 */
public class MapTest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        final Stream<Integer> objectStream = list.stream().map(integer -> integer * 2);
        objectStream.forEach(System.out::println);
    }
}
