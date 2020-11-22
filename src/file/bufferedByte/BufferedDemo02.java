package file.bufferedByte;

import java.io.*;

/**
 * @author Ann00
 * @date 2020/8/20
 */
public class BufferedDemo02 {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\系统软件\\macos\\macOS High Sierra 10.13.6(17G2112) Installer with Clover 4606.dmg"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\macOS High Sierra 10.13.6(17G2112) Installer with Clover 4606.dmg"));
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = bis.read(bytes)) != -1){
            bos.write(bytes,0,len);
        }
        long e = System.currentTimeMillis();
        System.out.println("缓存流复制耗时：" + (e - s) / 1000 +"s");
    }
}
