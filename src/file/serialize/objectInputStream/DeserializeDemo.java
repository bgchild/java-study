package file.serialize.objectInputStream;

import file.serialize.objectOutputStream.Employee;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author Ann00
 * @date 2020/8/21
 * 反序列化
 * public final Object readObject () : 读取一个对象。
 */
public class DeserializeDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/file/employee.txt"));
        Employee o = (Employee)ois.readObject();
        ois.close();
        System.out.println(o.getAddress());
    }
}
