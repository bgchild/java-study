package file.serialize.demo;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//将对象序列化到文件
        String filePath = "src/file/serialize/demo/test.txt";
        Student s = new Student("张三", 16);
        s.setGirl(new Girl("小小"));
        System.out.println(s);
        try (
                FileOutputStream fos = new FileOutputStream(filePath);
                ObjectOutputStream oss = new ObjectOutputStream(fos);
                //反序列化读取对象信息
                FileInputStream fis = new FileInputStream(filePath);
                ObjectInputStream ois = new ObjectInputStream(fis);
        ) {
            oss.writeObject(s);
            Student o = (Student) ois.readObject();
            System.out.println(o);
            System.out.println(o.getGirl().getName());
            System.out.println(o.toString());
        }
    }
}
