package file.printStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * @author Ann00
 * @date 2020/8/21
 * 改变打印流向
 */
public class printDemo {
    public static void main(String[] args) throws FileNotFoundException {
        // 调用系统的打印流,控制台直接输出97
        System.out.println(97);
        // 创建打印流,指定文件的名称
        PrintStream ps = new PrintStream("src/file/print.txt");
        // 设置系统的打印流流向,输出到print.txt
        System.setOut(ps);
        // 调用系统的打印流,print.txt中输出97
        System.out.println(97);
    }
}
