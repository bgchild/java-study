package ali.collection.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * collect
 * collect 就是一个归约操作，可以接受各种做法作为参数，将流中的元素累积成一个汇总结果
 *
 * @author laok
 * @date 2021/7/28
 */
public class CollectTest {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("ym", "rb", "llz", "gam", "zhm");
        final List<String> m = stream.filter((s) -> s.contains("m")).collect(Collectors.toList());
        for (String s : m) {
            System.out.println(s);
        }
    }
}
