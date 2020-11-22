package file.serialize.objectOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author Ann00
 * public final void writeObject (Object obj) : 将指定的对象写出
 * 序列化操作
 */
public class serializeDemo {
    public static void main(String[] args) throws IOException {
        Employee employee = new Employee();
        employee.setName("zhangSan");
        employee.setAddress("wuJiaoChang");
        employee.setAge(10);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/file/employee.txt"));
        oos.writeObject(employee);
        oos.close();
    }
}