package file.fileBase.inputStream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author Ann00
 * @date 2020/8/20
 */
public class fisRead3 {
    public static void main(String[] args) throws IOException {
        // 使用文件名称创建流对象
        FileInputStream fis = new FileInputStream("src/file/a.txt");
        int len;
        byte[] b = new byte[2];
        while ((len = fis.read(b))!=-1){
            System.out.println(new String(b,0,len));
        }
        fis.close();
    }
}
