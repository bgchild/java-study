package generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author Ann00
 * @date 2020/8/18
 */
public class GenericDemo1 {
    public static void main(String[] args) {
        Collection coll = new ArrayList();
        coll.add("abc");
        coll.add("hello");
        //由于集合没有做任何限定，任何类型都可以给其中存放
        coll.add(5);
        Iterator it = coll.iterator();
        while(it.hasNext()){
            //需要打印每个字符串的长度,就要把迭代出来的对象转成String类型
            String str = String.valueOf(it.next());
            System.out.println(str.length());
        }
    }
}
