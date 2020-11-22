package file.fileBase.reader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Ann00
 * @date 2020/8/20
 */
public class frRead1 {
    public static void main(String[] args) throws IOException {
        File file = new File("src/file/a.txt");
        FileReader fr = new FileReader(file);
        int b = 0;
        while ((b = fr.read())!= -1){
            System.out.println((char) b);
        }
    }
}
