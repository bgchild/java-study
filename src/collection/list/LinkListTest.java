package collection.list;

/**
 * @author Ann00
 * @date 2020/8/18
 * 方便元素添加、删除的集合
 */

import java.util.LinkedList;

/**
 * public void addFirst(E e) :将指定元素插入此列表的开头。
 * public void addLast(E e) :将指定元素添加到此列表的结尾。
 * public E getFirst() :返回此列表的第一个元素。
 * public E getLast() :返回此列表的后一个元素。
 * public E removeFirst() :移除并返回此列表的第一个元素。
 * public E removeLast() :移除并返回此列表的后一个元素。
 * public E pop() :从此列表所表示的堆栈处弹出一个元素。
 * public void push(E e) :将元素推入此列表所表示的堆栈。
 * public boolean isEmpty() ：如果列表不包含元素，则返回true。
 */
public class LinkListTest {
    public static void main(String[] args) {
        LinkedList<Object> lk = new LinkedList<>();
        lk.add("abc1");
        lk.add("abc2");
        lk.add("abc3");
        System.out.println(lk);

        lk.addFirst("abcfirst");
        System.out.println(lk);

        lk.addLast("abclast");
        System.out.println(lk);

        System.out.println(lk.getFirst());

        lk.removeFirst();
        System.out.println(lk);

        lk.removeLast();
        System.out.println(lk);

        lk.pop();
        System.out.println(lk);

        lk.push("abcpush");
        System.out.println(lk);

        System.out.println(lk.isEmpty());

    }
}
