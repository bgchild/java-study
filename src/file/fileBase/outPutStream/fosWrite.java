package file.fileBase.outPutStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Ann00
 * @date 2020/8/20
 * 写出字节数据
 */
public class fosWrite {
    public static void main(String[] args) throws IOException {
        //创建流对象
        File file = new File("src/file/a.txt");
        FileOutputStream fs = new FileOutputStream(file);
        //写入数据
        fs.write(97);
        fs.write(98);
        fs.write(99);
        //关闭资源
        fs.close();
    }
}
