package file.fileBase.reader;

/**
 * @author Ann00
 * @date 2020/8/20
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * FileReader(File file) ： 创建一个新的 FileReader ，给定要读取的File对象。
 * FileReader(String fileName) ： 创建一个新的 FileReader ，给定要读取的文件的名称。
 */
public class constructor {
    public static void main(String[] args) throws FileNotFoundException {
        // 使用File对象创建流对象
        File file = new File("a.txt");
        FileReader fr = new FileReader(file);
        // 使用文件名称创建流对象
        FileReader frs = new FileReader("b.txt");

    }
}
