package colation.list.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author Ann00
 * @date 2020/8/18
 */
public class listDemo {
    /*
    void add(int index,element) : 将指定的元素，添加到该集合中的指定位置上。
    E get(int index) :返回集合中指定位置的元素。
    E remove(int index) : 移除列表中指定位置的元素, 返回的是被移除的元素。
    E set(int index, element) :用指定元素替换集合中指定位置的元素,返回值的更新前的元素。
    */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("小魔仙");
        list.add("大眼萌");
        list.add("小雨滴");
        System.out.println(list);
        //指定位置添加 void add(int index,element)
        list.add(1,"吕小龙");
        System.out.println(list);
        //get(int index) :返回集合中指定位置的元素。
        System.out.println(list.get(0));
        //remove(int index) : 移除列表中指定位置的元素, 返回的是被移除的元素。
        list.remove(0);
        System.out.println(list.get(0));
        //set(int index, element) :用指定元素替换集合中指定位置的元素,返回值的更新前的元素。
        list.set(0,"小魔仙");
        System.out.println(list);
    }
}
