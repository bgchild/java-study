package file.fileBase.outPutStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Ann00
 * @date 2020/8/20
 * 写出字节数组： write(byte[] b)
 */
public class fosWrite2 {
    public static void main(String[] args) throws IOException {
        File file = new File("src/file/a.txt");
        FileOutputStream fs = new FileOutputStream(file);
        byte[] bytes = "齐天大圣".getBytes();
        fs.write(bytes);
        fs.close();
    }
}
