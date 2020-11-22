package colation.collections;

import colation.list.Student;

import java.util.ArrayList;

/**
 * @author Ann00
 * @date 2020/8/18
 */
public class collectionsSort {
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student("yy",6));
        al.add(new Student("cc",6));
        al.add(new Student("gg",7));
        //System.out.println(al);
        //按年龄从小到大
        al.sort((o1, o2) -> o1.getAge() - o2.getAge());
        System.out.println(al);
        //以学生的年龄降序
        al.sort((o1, o2) -> o2.getAge() - o1.getAge());
        System.out.println(al);
        //第一个规则判断完了，下一个规则，姓名的首字母，升序
        al.sort((o1, o2) ->
        {
            int res = o2.getAge() - o1.getAge();
            if (res == 0) {
                res = o1.getName().charAt(1) - o2.getName().charAt(1);
            }
            return res;
        });
        System.out.println(al);
    }
}
