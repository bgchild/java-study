package file.printStream;

import java.io.IOException;
import java.io.PrintStream;

public class PrintStremTest {
    public static void main(String[] args) throws IOException {
        /**
         * 构造方法
         * public PrintStream(String fileName) ： 使用指定的文件名创建一个新的打印流
         */
        final PrintStream ps = new PrintStream("src/file/print.txt");

        // 调用系统的打印流,控制台直接输出97
        //System.out.println(97);
        // 创建打印流,指定文件的名称
        final PrintStream ps1 = new PrintStream("src/file/print.txt");
        // 设置系统的打印流流向,输出到print.txt
        System.setOut(ps1);
        // 调用系统的打印流,print.txt中输出97
        System.out.println(97);
    }
}
