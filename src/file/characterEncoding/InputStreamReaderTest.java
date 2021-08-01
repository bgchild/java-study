package file.characterEncoding;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author laok
 */
public class InputStreamReaderTest {
    public static void main(String[] args) throws IOException {
        /*
         * 构造方法
         * InputStreamReader(InputStream in) : 创建一个使用默认字符集的字符流。
         * InputStreamReader(InputStream in, String charsetName) : 创建一个指定字符集的字符流。
         */
        InputStreamReader isr = new InputStreamReader(new FileInputStream("src/file/gbk.txt"));
        InputStreamReader isr2 = new InputStreamReader(new FileInputStream("src/file/gbk.txt"), "GBK");

        int len;
        while ((len = isr2.read()) != -1) {
            System.out.println((char) len);
        }
    }
}
