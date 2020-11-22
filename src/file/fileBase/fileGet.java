package file.fileBase;

/**
 * @author Ann00
 * @date 2020/8/19
 * 常用方法
 */

import java.io.File;

/**
 * public String getAbsolutePath() ：返回此File的绝对路径名字符串。
 * public String getPath() ：将此File转换为路径名字符串。
 * public String getName() ：返回由此File表示的文件或目录的名称。
 * public long length() ：返回由此File表示的文件的长度。
 */
public class fileGet {
    public static void main(String[] args) {
        File file = new File("src/file/a.txt");
        File absoluteFile = file.getAbsoluteFile();
        String path = file.getPath();
        String name = file.getName();
        long length = file.length();
        System.out.println("绝对路径："+absoluteFile);
        System.out.println("path："+path);
        System.out.println("name："+name);
        System.out.println("length："+length);

    }
}
