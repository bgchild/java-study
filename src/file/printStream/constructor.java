package file.printStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * @author Ann00
 * @date 2020/8/21
 * 构造方法
 * public PrintStream(String fileName) ： 使用指定的文件名创建一个新的打印流
 */
public class constructor {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("src/file/print.txt");
    }
}
