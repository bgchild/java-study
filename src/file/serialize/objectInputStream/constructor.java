package file.serialize.objectInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author Ann00
 * @date 2020/8/21
 * 构造方法
 * public ObjectInputStream(InputStream in) ： 创建一个指定InputStream的ObjectInputStream
 */
public class constructor {
    public static void main(String[] args) throws IOException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/file/employee.txt"));
    }
}
