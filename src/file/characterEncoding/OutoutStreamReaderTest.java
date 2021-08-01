package file.characterEncoding;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/**
 * @author laok
 */
public class OutoutStreamReaderTest {
    public static void main(String[] args) throws Exception {
        /**
         * 构造方法
         * OutputStreamWriter(OutputStream in) : 创建一个使用默认字符集的字符流。
         * OutputStreamWriter(OutputStream in, String charsetName) : 创建一个指定字符集的字符流。
         */
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("src/file/outputDemo1.txt"));
        OutputStreamWriter osw2 = new OutputStreamWriter(new FileOutputStream("src/file/outputDemo2.txt"), "GBK");
        // 写出数据
        osw.write("你好"); // 保存为6个字节
        osw.close();
        // 写出数据
        osw2.write("你好");// 保存为4个字节
        osw2.close();
    }
}
