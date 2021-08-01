package collection.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author Ann00
 * @date 2020/8/18
 */
public class IteratorTest {
    public static void main(String[] args) {
        // 使用多态方式 创建对象
        Collection<String> cl = new ArrayList<>();
        // 添加元素到集合
        cl.add("大眼萌");
        cl.add("小魔仙");
        cl.add("中小雨");
        //遍历
        //使用迭代器 遍历   每个集合对象都有自己的迭代器
        Iterator<String> iterator = cl.iterator();
        //泛型指的是 迭代出 元素的数据类型
        //判断是否有迭代元素
        //获取迭代出的元素
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("======================");
        //for增强
        for (String s : cl) {
            System.out.println(s);
        }
    }
}
