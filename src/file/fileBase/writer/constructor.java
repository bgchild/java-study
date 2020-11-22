package file.fileBase.writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Ann00
 * @date 2020/8/20
 * 构造函数
 */
public class constructor {
    public static void main(String[] args) throws IOException {
        // 使用File对象创建流对象
        File file = new File("a.txt");
        FileWriter fw = new FileWriter(file);
        // 使用文件名称创建流对象
        FileWriter fws = new FileWriter("b.txt");
    }
}
