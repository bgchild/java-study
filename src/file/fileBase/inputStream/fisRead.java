package file.fileBase.inputStream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author Ann00
 * @date 2020/8/20
 * 读取字节
 */
public class fisRead {
    public static void main(String[] args) throws IOException {
        // 使用文件名称创建流对象
        FileInputStream fis = new FileInputStream("src/file/a.txt");
        // 读取数据，返回一个字节
        int read = fis.read();
        System.out.println((char) read);
        read = fis.read();
        System.out.println((char) read);
        read = fis.read();
        System.out.println((char) read);
        read = fis.read();
        System.out.println((char) read);
        // 读取到末尾,返回‐1
        read = fis.read();
        System.out.println(read);
        // 关闭资源
        fis.close();

    }
}
