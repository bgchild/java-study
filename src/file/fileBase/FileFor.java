package file.fileBase;

/**
 * @author Ann00
 * @date 2020/8/19
 * 目录遍历
 */

import java.io.File;

/**
 * public String[] list() ：返回一个String数组，表示该File目录中的所有子文件或目录。
 * public File[] listFiles() ：返回一个File数组，表示该File目录中的所有的子文件或目录
 */
public class FileFor {
    public static void main(String[] args) {
        File file = new File("D:\\newDir");
        for (String s : file.list()) {
            System.out.println(s);
        }

        for (File f : file.listFiles()) {
            System.out.println(f.isDirectory());
        }

    }
}
