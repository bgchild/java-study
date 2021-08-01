package ali.collection.stream;

import java.util.Random;

/**
 * forEach
 * Stream 提供了方法 'forEach' 来迭代流中的每个数据
 * @author laok
 * @date 2021/7/28
 */
public class ForEachTest {
    public static void main(String[] args) {
          Random random = new Random();
          random.ints().limit(10).forEach(System.out::println);
    }
}
