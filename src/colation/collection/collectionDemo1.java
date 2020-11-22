package colation.collection;

import java.util.ArrayList;
import java.util.Collection;

/*
    java.util.Collection接口
        所有单列集合的最顶层的接口,里边定义了所有单列集合共性的方法
        任意的单列集合都可以使用Collection接口中的方法

    共性的方法:
      public boolean add(E e)：  把给定的对象添加到当前集合中 。
      public void clear() :清空集合中所有的元素。
      public boolean remove(E e): 把给定的对象在当前集合中删除。
      public boolean contains(E e): 判断当前集合中是否包含给定的对象。
      public boolean isEmpty(): 判断当前集合是否为空。
      public int size(): 返回集合中元素的个数。
      public Object[] toArray(): 把集合中的元素，存储到数组中。
 */
public class collectionDemo1 {

    public static void main(String[] args) {
        // 创建集合对象
        // 使用多态形式
        Collection<String> cl = new ArrayList<>();
        // 使用方法
        // 添加功能  boolean  add(String s)
        cl.add("小魔仙");
        cl.add("小萌萌");
        System.out.println(cl);
        //boolean remove(E e) 删除在集合中的o元素
        cl.remove("小萌萌");
        System.out.println(cl);
        //boolean contains(E e) 判断当前集合中是否包含给定的对象
        System.out.println(cl.contains("小魔仙"));
        //boolean isEmpty(): 判断当前集合是否为空
        System.out.println(cl.isEmpty());
        //int size(): 返回集合中元素的个数
        System.out.println(cl.size());
        //Object[] toArray(): 把集合中的元素，存储到数组中
        Object[] objects = cl.toArray();
        for (Object item: objects) {
            System.out.println(item);
        }
        //void clear() :清空集合中所有的元素
        cl.clear();
        System.out.println(cl);
    }
}
