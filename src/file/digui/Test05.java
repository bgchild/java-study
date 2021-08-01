package file.digui;

import java.io.File;

/**
 * 文件搜索
 * 1. 目录搜索，无法判断多少级目录，所以使用递归，遍历所有目录。
 * 2. 遍历目录时，获取的子文件，通过文件名称，判断是否符合条件。
 *
 * @author laok
 */
public class Test05 {
    public static void main(String[] args) {
        searchFile(new File("D:\\系统软件"));
    }

    public static void searchFile(File file) {
        if (file.isDirectory()) {
            for (File listFile : file.listFiles()) {
                searchFile(listFile);
            }
        } else {
            if (file.getName().endsWith("iso")) {
                System.out.println(file.getAbsolutePath());
            }
        }
    }
}
