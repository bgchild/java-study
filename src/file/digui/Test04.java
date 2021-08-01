package file.digui;

import java.io.File;

/**
 * 递归打印目录
 *
 * @author laok
 */
public class Test04 {
    public static void main(String[] args) {
        File file = new File("src/file/digui");
        dirList(file);
    }

    public static void dirList(File file) {
        System.out.println(file.getAbsolutePath());
        if (file.isDirectory()) {
            for (File listFile : file.listFiles()) {
                dirList(listFile);
            }
        }
    }
}
