package file.digui;

import java.io.File;
import java.util.Objects;

/**
 *
 * @author Ann00
 * @date 2020/8/20
 * 递归打印目录
 */

public class Demo04 {
    public static void main(String[] args) {
        printFiles("D:\\home");
    }

    public static void printFiles(String path){
        File file = new File(path);
        for (File s : Objects.requireNonNull(file.listFiles())) {
            System.out.println(s.getAbsolutePath());
            if (s.isDirectory()){
                printFiles(s.getPath());
            }
        }
    }
}
