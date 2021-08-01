package ali.collection.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 流的创建
 * filter 方法用于通过设置的条件过滤出元素
 * @author laok
 * @date 2021/7/28
 */
public class StreamCreate {
    public static void main(String[] args) {
        //通过已有的集合来创建流
        List<String> arr = Arrays.asList("ym", "rb", "llz", "gam", "zhm");
        Stream<String> stream = arr.stream();
        //通过 Stream 创建流
        Stream<String> stringStream = Stream.of("ym", "rb", "llz", "gam", "zhm");
    }
}
