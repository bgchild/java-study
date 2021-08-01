package file.serialize.objectInputStream;

import file.serialize.objectOutputStream.Employee;

import java.io.*;

/**
 * 反序列化一个对象
 *
 * @author laok
 */
public class ObjectInputStreamTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /**
         * 构造方法
         * public ObjectInputStream(InputStream in) ： 创建一个指定InputStream的ObjectInputStream
         */
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/file/employee.txt"));
         Employee o = (file.serialize.objectOutputStream.Employee) ois.readObject();
        ois.close();
        System.out.println(o.getAddress());
    }
}
