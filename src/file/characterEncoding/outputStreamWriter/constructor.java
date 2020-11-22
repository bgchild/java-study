package file.characterEncoding.outputStreamWriter;

import java.io.*;

/**
 * @author Ann00
 * @date 2020/8/21
 * 构造方法
 * OutputStreamWriter(OutputStream in) : 创建一个使用默认字符集的字符流。
 * OutputStreamWriter(OutputStream in, String charsetName) : 创建一个指定字符集的字符流。
 */
public class constructor {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter isr = new OutputStreamWriter(new FileOutputStream("out.txt"));
        OutputStreamWriter isr2 = new OutputStreamWriter(new FileOutputStream("out.txt") , "GBK");
    }
}
