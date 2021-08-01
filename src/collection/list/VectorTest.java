package collection.list;

import java.util.Vector;

/**
 * vector
 * 使用方法和ArrayList类型
 * 区别同步线程安全
 *
 * @author laok
 */
public class VectorTest {
    public static void main(String[] args) {
        Vector<Object> v = new Vector<>();
        v.add("张3");
        v.add("李4");
        for (Object o : v) {
            System.out.println(o);
        }
    }
}
