package api.arrayList;

/**
 * @author Ann00
 * @date 2020/8/21
 */
public class studentArrayDemo {
    public static void main(String[] args) {
        //创建学生数组
        Student[] students = new Student[3];
        //创建学生对象
        Student s1 = new Student("曹操", 40);
        Student s2 = new Student("刘备", 35);
        Student s3 = new Student("孙权", 30);
        //把学生对象作为元素赋值给学生数组
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        //遍历学生数组
        for (Student s : students) {
            System.out.println(s.getName() + "‐‐‐" + s.getAge());
        }
    }
}
