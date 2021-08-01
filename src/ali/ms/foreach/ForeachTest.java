package ali.ms.foreach;

import java.util.ArrayList;
import java.util.List;

/**
 * 为什么阿里巴巴禁止在foreach循环里进行元素的remove/add操作
 */
public class ForeachTest {
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add("1");
        a.add("2");
        //ConcurrentModificationException
//        for (String s : a) {
//            if ("2".equals(s)) {
//                a.remove(s);
//            }
//        }
//        System.out.println(a);

        //对增强for循环的语法糖进行解糖
//        Iterator iterator = a.iterator();
//        do {
//            if (!iterator.hasNext()) break;
//            final String next = (String) iterator.next();
//            if ("2".equals(next)) {
//                a.remove(next);
//            }
//        } while (true);
//        System.out.println(a);

        //迭代器遍历删除
//        Iterator<String> iterator = a.iterator();
//        while (iterator.hasNext()) {
//            if ("2".equals(iterator.next())) {
//                iterator.remove();
//            }
//        }
//        System.out.println(a);


    }
}
