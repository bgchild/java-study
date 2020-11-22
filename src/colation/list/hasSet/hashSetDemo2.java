package colation.list.hasSet;

import colation.list.Student;

import java.util.HashSet;

/**
 * @author Ann00
 * @date 2020/8/18
 * 保证唯一、不保证顺序
 */
public class hashSetDemo2 {
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<>();
        hs.add(new Student("贾静雯",33));
        hs.add(new Student("陈乔恩",23));
        hs.add(new Student("佟丽娅",28));
        hs.add(new Student("佟丽娅",28));
        for (Student s: hs) {
            System.out.println(s.toString());
        }
    }
}
