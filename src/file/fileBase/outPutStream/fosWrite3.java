package file.fileBase.outPutStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Ann00
 * @date 2020/8/20
 * 写出指定长度字节数组： write(byte[] b, int off, int len)
 */
public class fosWrite3 {
    public static void main(String[] args) throws IOException {
        File file = new File("src/file/a.txt");
        FileOutputStream fs = new FileOutputStream(file);
        byte[] bytes = "qtds".getBytes();
        fs.write(bytes,2,2);
        fs.close();
    }
}
