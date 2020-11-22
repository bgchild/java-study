package file.fileBase.writer;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Ann00
 * @date 2020/8/20
 * 写出字符串
 */
public class fwWrite4 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("src/file/a.txt");
        String s = "齐天大圣";
        fw.write(s);
        fw.write(s,2,2);
        fw.close();
    }
}
