package file.fileBase.inputStream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author Ann00
 * @date 2020/8/20
 * 循环读取字节
 */
public class fisRead2 {
    public static void main(String[] args) throws IOException {
        // 使用文件名称创建流对象
        FileInputStream fis = new FileInputStream("src/file/a.txt");
        int b = 0;
        while ((b = fis.read())!=-1){
            System.out.println(b);
        }
        fis.close();
    }
}
