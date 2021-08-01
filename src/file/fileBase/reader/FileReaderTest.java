package file.fileBase.reader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

    public static void main(String[] args) throws IOException {
        /**
         * 构造函数
         * FileReader(File file) ： 创建一个新的 FileReader ，给定要读取的File对象。
         * FileReader(String fileName) ： 创建一个新的 FileReader ，给定要读取的文件的名称。
         */
        final File file = new File("src/file/a.txt");
        final FileReader fileReader = new FileReader(file);

        final FileReader fr = new FileReader("src/file/a.txt");

        /**
         * 读取文件
         */
        FileReader fr1 = new FileReader(file);
        int len1;
        while ((len1 = fr1.read()) != -1) {
            System.out.println((char) len1);
        }
        fr1.close();

        FileReader fr2 = new FileReader(file);
        char[] cs = new char[2];
        int len2;
        while ((len2 = fr2.read(cs)) != -1) {
            System.out.println(new String(cs, 0, len2));
        }
        fr2.close();
    }
}
