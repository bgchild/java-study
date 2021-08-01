package file.fileBase.demo;

/**
 * @author Ann00
 * @date 2020/8/19
 * 判断功能的方法
 */

import java.io.File;

/**
 * public boolean exists() ：此File表示的文件或目录是否实际存在。
 * public boolean isDirectory() ：此File表示的是否为目录。
 * public boolean isFile() ：此File表示的是否为文件。
 */
public class FileIs {
    public static void main(String[] args) {
        File file = new File("src/file/a.txt");
        File file2 = new File("src/file/");
        System.out.println("src/file/a.txt 是否存在:"+file.exists());
        System.out.println("src/file/ 是否存在:"+file.exists());
        // 判断是文件还是目录
        System.out.println("src/file/a.txt 文件?:"+file.isFile());
        System.out.println("src/file 目录?:"+file2.isDirectory());

    }
}
