package file.fileBase;

import java.io.File;

/**
 * @author Ann00
 * @date 2020/8/19
 * 构造方法
 */
//public File(String pathname) ：通过将给定的路径名字符串转换为抽象路径名来创建新的 File实例。
//public File(String parent, String child) ：从父路径名字符串和子路径名字符串创建新的 File实例。
//public File(File parent, String child) ：从父抽象路径名和子路径名字符串创建新的 File实例。
public class fileConstructor {

    public static void main(String[] args) {
        File file = new File("src/file/a.txt");
        String parent = "src/file/fileBase";
        String child = "b.txt";
        File file1 = new File(parent, child);
        File parents = new File(parent);
        String childs = "c.txt";
        File file2 = new File(parents, childs);
    }
}
