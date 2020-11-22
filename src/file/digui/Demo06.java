package file.digui;

import javax.naming.NamingEnumeration;
import java.io.File;
import java.io.FileFilter;
import java.util.Objects;

/**
 * @author Ann00
 * @date 2020/8/20
 * 文件过滤器优化
 */

/**
 * 1. 接口作为参数，需要传递子类对象，重写其中方法。我们选择匿名内部类方式，比较简单。
 * 2. accept 方法，参数为File，表示当前File下所有的子文件和子目录。保留住则返回true，过滤掉则返回false。保留规则：
 * 1. 要么是.java文件。
 * 2. 要么是目录，用于继续遍历。
 * 3. 通过过滤器的作用， listFiles(FileFilter) 返回的数组元素中，子文件对象都是符合条件的，可以直接打印。
 */
public class Demo06 {
    public static void main(String[] args) {
        searchFile("D:\\demo\\study\\src\\file");
    }

    private static void searchFile(String path) {
        File file = new File(path);
        File[] files = file.listFiles(
                (File pathname) -> pathname.getName().endsWith(".java") || pathname.isDirectory()
        );
        for (File s : Objects.requireNonNull(files)) {
            if (s.isDirectory()) {
                searchFile(s.getPath());
            } else {
                System.out.println(s.getAbsolutePath());
            }
        }
    }
}
