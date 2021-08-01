package file.serialize.objectOutputStream;

import java.io.*;

/**
 * 序列化对象到文件
 *
 * @author laok
 */
public class ObjectOutPutStreamTest {
    public static void main(String[] args) throws IOException {
        /**
         * 构造方法
         * public ObjectOutputStream(OutputStream out) ： 创建一个指定OutputStream的ObjectOutputStream
         */
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/file/employee.txt"));

        Employee employee = new Employee();
        employee.setName("zhangSan");
        employee.setAddress("wuJiaoChang");
        employee.setAge(10);

        oos.writeObject(employee);
        oos.close();
    }
}
