package file.fileBase.inputStream;

import java.io.*;

public class InputStreamTest {

    public static void main(String[] args) throws IOException {
        /**
         * 创建输入流
         */
        // 使用File对象创建流对象
        final File file = new File("src/file/a.txt");
        InputStream is = new FileInputStream(file);
        // 使用文件名称创建流对象
        InputStream fis = new FileInputStream("src/file/a.txt");

        /**
         * 读取数据，返回一个字节,读取最后返回-1
         */
        int read = fis.read();
        System.out.println((char) read);
        read = fis.read();
        System.out.println((char) read);
        read = fis.read();
        System.out.println((char) read);
        read = fis.read();
        System.out.println((char) read);
        read = fis.read();
        System.out.println((char) read);
        //关闭资源
        fis.close();

        /**
         * 循环读取字节
         */
        InputStream fis2 = new FileInputStream(file);
        int len2;
        while ((len2 = fis2.read()) != -1) {
            System.out.println(len2);
        }
        fis2.close();

        InputStream fis3 = new FileInputStream(file);
        byte[] b3 = new byte[3];
        int len3;
        while ((len3 = fis3.read(b3)) != -1) {
            System.out.println(new String(b3, 0, len3));
        }
        fis3.close();
    }
}
