package file.characterEncoding.inputStreamReade;

import java.io.*;

/**
 * @author Ann00
 * @date 2020/8/21
 * 构造方法
 * InputStreamReader(InputStream in) : 创建一个使用默认字符集的字符流。
 * InputStreamReader(InputStream in, String charsetName) : 创建一个指定字符集的字符流。
 */
public class constructor {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("in.txt"));
        InputStreamReader isr2 = new InputStreamReader(new FileInputStream("in.txt") , "GBK");
    }
}
