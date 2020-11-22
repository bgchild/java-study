package file.fileBase.writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Ann00
 * @date 2020/8/20
 */
public class fwWrite1 {
    public static void main(String[] args) throws IOException {
        File file = new File("src/file/a.txt");
        FileWriter fw = new FileWriter(file);
        fw.write("97");
        fw.write("98");
        fw.close();
    }
}
