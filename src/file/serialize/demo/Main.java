package file.serialize.demo;

import file.serialize.demo.Student;

import java.io.*;
import java.util.ArrayList;

/**
 * @author Ann00
 * 序列化
 */
public class Main {
    //1. 把若干学生对象 ，保存到集合中。
    //2. 把集合序列化。
    //3. 反序列化读取时，只需要读取一次，转换为集合类型。
    //4. 遍历集合，可以打印所有的学生信息

    /**
     * 分析
     * 1、创建一个ArrayList集合用于存储学生对象信息
     * 2、添加学生对象信息到集合
     * 3、将集合序列化写入文件
     * 4、反向序列化文件到集合
     * 5、遍历集合打印学信息
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //1、创建一个ArrayList集合用于存储学生对象信息
        ArrayList<Student> students = new ArrayList<>();
        //2、添加学生对象信息到集合
        students.add(new Student("张三", 18));
        students.add(new Student("李思", 17));
        students.add(new Student("王五", 16));
        //3、将集合序列化写入文件
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/file/student.txt"));
        oos.writeObject(students);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/file/student.txt"));
        ArrayList<Student> studentslist = (ArrayList<Student>) ois.readObject();
        ois.close();
        oos.close();
        for (Student student : studentslist) {
            System.out.println(student.toString());
        }
    }
}
