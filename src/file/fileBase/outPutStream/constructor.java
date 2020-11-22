package file.fileBase.outPutStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @author Ann00
 * @date 2020/8/20
 * 构造方法
 */
public class constructor {
    /**
     * public FileOutputStream(File file) ：创建文件输出流以写入由指定的 File对象表示的文件。
     * public FileOutputStream(String name) ： 创建文件输出流以指定的名称写入文件。
     */
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/file/a.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);

        FileOutputStream fileOutputStream1 = new FileOutputStream("src/file/a.txt");

        System.out.println(fileOutputStream);
        System.out.println(fileOutputStream1);

    }
}
