package api.statickey;

/**
 * @author Ann00
 * @date 2020/8/21
 */
public class Student {
    private String name;
    private int age;
    // 学生的id
    private int sid;
    // 类变量，记录学生数量，分配学号
    public static int numberOfStudent = 0;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        // 通过 numberOfStudent 给学生分配学号
        this.sid = ++numberOfStudent;
    }

    // 打印属性值
    public void show() {
        System.out.println("Student : name=" + name + ", age=" + age + ", sid=" + sid);
    }

    public static void showNum() {
        System.out.println("num:" + numberOfStudent);
    }
}
