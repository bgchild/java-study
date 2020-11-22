package file.bufferedByte;

import java.io.*;

/**
 * @author Ann00
 * @date 2020/8/20
 * 构造方法
 * public BufferedInputStream(InputStream in) ：创建一个 新的缓冲输入流。
 * public BufferedOutputStream(OutputStream out) ： 创建一个新的缓冲输出流。
 */
public class constructor {
    public static void main(String[] args) throws FileNotFoundException {
        //创建缓冲输入流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/file/a.txt"));
        //创建缓存输出流
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/file/a.txt"));
    }
}
