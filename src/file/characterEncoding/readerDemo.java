package file.characterEncoding;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author Ann00
 * @date 2020/8/21
 * 编码引出的问题
 */
public class readerDemo {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("src/file/gbk.txt");
        int read;
        while ((read = fileReader.read()) != -1) {
            System.out.print((char)read);
        }
        fileReader.close();
    }
}
