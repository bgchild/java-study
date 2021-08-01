package file.fileBase.writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileWriteTest {
    public static void main(String[] args) throws IOException {
        /**
         * 构造函数
         */
        final File file = new File("src/file/a.txt");
        final FileWriter fileWriter = new FileWriter(file);

        final FileWriter fw = new FileWriter("src/file/a.txt");

        fw.write("97");
        fw.write("98");
        fw.close();

        /**
         * flush ：刷新缓冲区，流对象可以继续使用。
         * close :先刷新缓冲区，然后通知系统释放资源。流对象不可以再被使用了。
         */
        final FileWriter fw1 = new FileWriter(file);
        // 写出数据，通过flush
        fw1.write('刷');
        fw1.flush();
        // 继续写出第2个字符，写出成功
        fw1.write('新');
        fw1.flush();
        // 写出数据，通过close
        // 写出第1个字符
        fw1.write('关');
        fw1.close();
        // 继续写出第2个字符,【报错】java.io.IOException: Stream closed
        //fw1.write('闭');

        /**
         * 写出字符数组
         */
        final FileWriter fw2 = new FileWriter(file);
        final char[] chars = "提拉米苏".toCharArray();
        fw2.write(chars);
        fw2.write(chars, 2, 2);
        fw2.close();

        /**
         * 写出换成
         */
        final FileWriter fw3 = new FileWriter(file);
        fw3.write("齐天大圣");
        fw3.write("\r\n");
        fw3.write("孙悟空");
        fw3.close();
    }
}
