package ali.collection.foreach;

import com.google.common.collect.ImmutableList;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/**
 * 集合迭代的方式
 * 1、通过普通 for 循环迭代
 * 2、通过增强 for 循环迭代
 * 3、使用 Iterator 迭代
 * 4、使用 Stream 迭代
 *
 * @author laok
 * @date 2021/7/29
 */
public class CollectionForeachTest {
    public static void main(String[] args) {
        List<String> list = ImmutableList.of("a", "b", "c");
        //1、通过普通 for 循环迭代
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }

        //2、通过增强 for 循环迭代
        for (String s : list) {
            System.out.print(s);
        }

        //3、使用 Iterator 迭代
        final Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }

        //4、使用 Stream 迭代
        final Stream<String> stream = list.stream();
        stream.forEach(System.out::print);
    }
}
