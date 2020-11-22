package colation.list.linkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author Ann00
 * @date 2020/8/18
 * 保证唯一和顺序
 */
public class linkedHashSetDemo {
    public static void main(String[] args) {
        Set<String> lhs = new LinkedHashSet<>();
        lhs.add("aaa");
        lhs.add("bbb");
        lhs.add("ccc");
        lhs.add("aaa");
        Iterator<String> it = lhs.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
