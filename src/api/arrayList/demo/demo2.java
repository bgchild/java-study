package api.arrayList.demo;

import api.arrayList.Student;

import java.util.ArrayList;

/**
 * @author Ann00
 * @date 2020/8/21
 * 自定义4个学生对象,添加到集合,并遍历
 */
public class demo2 {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<Student> list = new ArrayList<Student>();
        //创建学生对象
        Student s1 = new Student("赵丽颖",18);
        Student s2 = new Student("唐嫣",20);
        Student s3 = new Student("景甜",25);
        Student s4 = new Student("柳岩",19);
        //把学生对象作为元素添加到集合中
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        //遍历集合
        for (Student s : list) {
            System.out.println(s.getName() + "‐‐‐" + s.getAge());
        }
    }
}
