package file.fileBase.outPutStream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Ann00
 * @date 2020/8/20
 * 写入换行
 */
public class fosWrite5 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fs = new FileOutputStream("src/file/a.txt");
        byte[] bytes = "abcd".getBytes();
        for (byte aByte : bytes) {
            fs.write(aByte);
            fs.write("\r\n".getBytes());
        }
        fs.close();
    }
}
