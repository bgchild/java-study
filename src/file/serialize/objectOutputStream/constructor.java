package file.serialize.objectOutputStream;

import java.io.*;

/**
 * @author Ann00
 * @date 2020/8/21
 * 构造方法
 * public ObjectOutputStream(OutputStream out) ： 创建一个指定OutputStream的ObjectOutputStream。
 */
public class constructor {
    public static void main(String[] args) throws IOException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/file/print.txt"));
    }
}
