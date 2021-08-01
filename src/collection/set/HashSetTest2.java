package collection.set;

import java.util.HashSet;

/**
 * @author Ann00
 * @date 2020/8/18
 * 保证唯一、不保证顺序
 * 对象的删错要重写equals、hashCode方法
 */
public class HashSetTest2 {
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<>();
        hs.add(new Student("贾静雯", 33));
        hs.add(new Student("陈乔恩", 23));
        hs.add(new Student("佟丽娅", 28));
        hs.add(new Student("佟丽娅", 28));
        hs.remove(new Student("贾静雯", 33));
        for (Student s : hs) {
            System.out.println(s.toString());
        }
    }
}
