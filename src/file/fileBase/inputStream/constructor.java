package file.fileBase.inputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author Ann00
 * @date 2020/8/20
 */
public class constructor {
    public static void main(String[] args) throws FileNotFoundException {
        // 使用File对象创建流对象
        File file = new File("src/a.txt");
        FileInputStream fos = new FileInputStream(file);
        // 使用文件名称创建流对象
        FileInputStream fos1 = new FileInputStream("src/b.txt");
    }
}
