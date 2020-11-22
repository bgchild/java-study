package file.fileBase.outPutStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Ann00
 * @date 2020/8/20
 * 数据追加
 */
public class fosWrite4 {
    public static void main(String[] args) throws IOException {
        File file = new File("src/file/a.txt");
        FileOutputStream fs = new FileOutputStream(file, true);
        byte[] bytes = "zuijia".getBytes();
        fs.write(bytes);
        fs.close();
    }

}
