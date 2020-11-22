package file.bufferedByte;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Ann00
 * @date 2020/8/20
 * 基本流 复制大文件测试
 */
public class BufferedDemo {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("D:\\系统软件\\macos\\macOS High Sierra 10.13.6(17G2112) Installer with Clover 4606.dmg");
        FileOutputStream fos = new FileOutputStream("D:\\mac.dmg");
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }
        fos.close();
        fis.close();
        long e = System.currentTimeMillis();
        System.out.println("普通复制耗时：" + (e - s) / 1000 +"s");
    }
}
