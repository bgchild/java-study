package file.digui;

import java.io.File;
import java.util.Objects;

/**
 * @author Ann00
 * 文件搜索
 * 1. 目录搜索，无法判断多少级目录，所以使用递归，遍历所有目录。
 * 2. 遍历目录时，获取的子文件，通过文件名称，判断是否符合条件。
 */
public class Demo05{
    public static void main(String[] args) {
       searchFile("D:\\系统软件");
    }

    private static void searchFile(String path) {
        File file = new File(path);
        for (File s : Objects.requireNonNull(file.listFiles())) {
            if (s.isDirectory()){
                searchFile(s.getPath());
            }else{
                if(s.getName().endsWith(".pdf")){
                    System.out.println(s.getAbsolutePath());
                };
            }
        }
    }
}
