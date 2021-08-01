package file.bufferedChar;

import java.io.*;

/**
 * 缓存字符流
 * @author laok
 */
public class BufferedCharTest {
    public static void main(String[] args) throws IOException {
        /**
         * 构造方法
         * public BufferedReader(Reader in) ：创建一个 新的缓冲输入流。
         * public BufferedWriter(Writer out) ： 创建一个新的缓冲输出流。
         */
        // 创建字符缓冲输入流
        BufferedReader br = new BufferedReader(new FileReader("src/file/a.txt"));
        // 创建字符缓冲输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/file/a.txt"));
        bw.write("做了一个只会歌唱的傻瓜");
        bw.newLine();
        bw.write("做了一个只会歌唱的傻瓜");
        bw.flush();
        bw.close();
    }
}
