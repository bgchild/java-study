package ali.collection.stream;

import java.util.stream.Stream;

/**
 * Filter
 * @author laok
 * @date 2021/7/28
 */
public class FilterTest {
    public static void main(String[] args) {
        //通过 Stream 创建流
        Stream<String> stream = Stream.of("ym", "rb", "llz", "gam", "zhm");
        final Stream<String> stringStream = stream.filter(s -> s.contains("m"));
        final Object[] objects = stringStream.toArray();
        for (Object object : objects) {
            System.out.println(object);
        }
    }
}
