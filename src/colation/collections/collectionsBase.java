package colation.collections;

/**
 * @author Ann00
 * @date 2020/8/18
 */

import java.util.ArrayList;
import java.util.Collections;

/**
 * java.utils.Collections 是集合工具类，用来对集合进行操作。部分方法如下：
 * public  static  <T>  boolean  addAll(Collection<T>  c,  T...  elements) :往集合中添加一些元素。
 * public  static  void  shuffle(List<?>  list)  打乱顺序 :打乱集合顺序。
 * public  static  <T>  void  sort(List<T>  list) :将集合中元素按照默认规则排序。
 * public  static  <T>  void  sort(List<T>  list，Comparator<?  super  T>  ) :将集合中元素按照指定规则排 序。
 */
public class collectionsBase {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
//        al.add(1);
//        al.add(2);
//        al.add(3);
        Collections.addAll(al,1,2,3);
        System.out.println(al);
        Collections.shuffle(al);
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
        Collections.sort(al,(o1,  o2) -> o2-o1);
        System.out.println(al);
    }
}
