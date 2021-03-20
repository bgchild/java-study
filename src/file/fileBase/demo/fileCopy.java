package file.fileBase.demo;

import java.io.*;

/**
 * @author Ann00
 * @date 2020/8/20
 * 图片复制
 */
public class fileCopy {
    public static void main(String[] args) throws IOException {

        File file = new File("D:\\music\\yqxs.mp3");
        File file1 = new File("D:\\yqxs.mp3");
        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream(file1);
        int len = 0;
        byte[] b = new byte[1024];
        while ((len = fis.read(b)) != -1) {
            fos.write(b, 0, len);
        }
        fos.close();
        fis.close();

    }
}
