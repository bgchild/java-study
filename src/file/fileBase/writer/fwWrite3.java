package file.fileBase.writer;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Ann00
 * @date 2020/8/20
 * 写出字符数组
 */
public class fwWrite3 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("src/file/a.txt");
        char[] chars = "提拉米苏".toCharArray();
        fw.write(chars);
        fw.write(chars,0,2);
        fw.close();
    }
}
