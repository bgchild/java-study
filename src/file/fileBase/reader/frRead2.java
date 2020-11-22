package file.fileBase.reader;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author Ann00
 * @date 2020/8/20
 */
public class frRead2 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("src/file/a.txt");
        char[] cs = new char[2];
        int len = 0;
        while ((len = fr.read(cs)) != -1){
            System.out.println(new String(cs,0,len));
        }
    }
}
