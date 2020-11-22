package file.bufferedChar;

import java.io.*;

/**
 * @author Ann00
 * @date 2020/8/20
 * 构造方法
 * public BufferedReader(Reader in) ：创建一个 新的缓冲输入流。
 * public BufferedWriter(Writer out) ： 创建一个新的缓冲输出流。
 */
public class constructor {
    public static void main(String[] args) throws IOException {
        // 创建字符缓冲输入流
        BufferedReader br = new BufferedReader(new FileReader("br.txt"));
        // 创建字符缓冲输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("bw.txt"));
    }
}
