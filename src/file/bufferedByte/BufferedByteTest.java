package file.bufferedByte;

import java.io.*;

/**
 * 缓冲字符流
 */
public class BufferedByteTest {
    public static void main(String[] args) throws IOException {
        /**
         * @author Ann00
         * @date 2020/8/20
         * 构造方法
         * public BufferedInputStream(InputStream in) ：创建一个 新的缓冲输入流。
         * public BufferedOutputStream(OutputStream out) ： 创建一个新的缓冲输出流。
         */
        //创建缓冲输入流
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("src/file/a.txt"));
        //创建缓存输出流
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("src/file/a.txt"));

        /**
         * 基本流 复制大文件测试
         */
        final File inFile = new File("D:\\系统软件\\系统文件\\CentOS-8-x86_64-1905-dvd1.iso");
        final File outFile = new File("D:\\CentOS.dmg");
        long s = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream(inFile);
        FileOutputStream fos = new FileOutputStream(outFile);
        byte[] bytes = new byte[1024];
        int len;
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }
        fos.close();
        fis.close();
        long e = System.currentTimeMillis();
        System.out.println("普通复制耗时：" + (e - s) / 1000 + "s");

        //缓冲流 复制
        long s1 = System.currentTimeMillis();
        FileInputStream fis1 = new FileInputStream(inFile);
        FileOutputStream fos1 = new FileOutputStream(outFile);
        BufferedInputStream bis = new BufferedInputStream(fis1);
        BufferedOutputStream bos = new BufferedOutputStream(fos1);
        byte[] bytes1 = new byte[1024];
        int len1;
        while ((len1 = bis.read(bytes)) != -1) {
            bos.write(bytes1, 0, len1);
        }
        fos1.close();
        fis1.close();
        long e1 = System.currentTimeMillis();
        System.out.println("缓存流复制耗时：" + (e1 - s1) / 1000 + "s");
    }
}
