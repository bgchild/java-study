package file.fileBase.writer;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Ann00
 * @date 2020/8/20
 * flush ：刷新缓冲区，流对象可以继续使用。
 * close :先刷新缓冲区，然后通知系统释放资源。流对象不可以再被使用了。
 */
public class fwWrite2 {
    public static void main(String[] args) throws IOException {
        // 使用文件名称创建流对象
        FileWriter fw = new FileWriter("src/file/a.txt");
        // 写出数据，通过flush
        fw.write('刷'); // 写出第1个字符
        fw.flush();
        fw.write('新'); // 继续写出第2个字符，写出成功
        fw.flush();
        // 写出数据，通过close
        fw.write('关'); // 写出第1个字符
        fw.close();
        fw.write('闭'); // 继续写出第2个字符,【报错】java.io.IOException: Stream closed
        fw.close();
    }
}
