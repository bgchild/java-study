package file.fileBase.outPutStream;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class OutPutStreamTest {
    public static void main(String[] args) throws IOException {
        /**
         * 构造方法
         * public FileOutputStream(File file) ：创建文件输出流以写入由指定的 File对象表示的文件。
         * public FileOutputStream(String name) ： 创建文件输出流以指定的名称写入文件。
         */
        final File file = new File("src/file/b.txt");
        final OutputStream os = new FileOutputStream(file);

        FileOutputStream fos = new FileOutputStream("src/file/b.txt");
        //写入数据
        fos.write(97);
        fos.write(98);
        fos.write(99);
        //关闭资源
        fos.close();

        //写出字节数组： write(byte[] b)
        final FileOutputStream fos1 = new FileOutputStream(file);
        final byte[] bytes = "齐天大圣".getBytes(StandardCharsets.UTF_8);
        fos1.write(bytes);
        fos1.close();

        //写出指定长度字节数组： write(byte[] b, int off, int len)
        final FileOutputStream fos2 = new FileOutputStream(file);
        byte[] bytes2 = "abide".getBytes();
        fos2.write(bytes2, 0, 2);

        //数据追加
        FileOutputStream fos3 = new FileOutputStream(file, true);
        fos3.write("追加，不覆盖！".getBytes(StandardCharsets.UTF_8));
        fos3.close();

        //写入换行
        final FileOutputStream fos4 = new FileOutputStream(file);
        byte[] bytes4 = "abc".getBytes();
        for (byte b : bytes4) {
            fos4.write(b);
            fos4.write("\r\n".getBytes());
        }
        fos4.close();
    }
}
