package file.fileBase.demo;

import java.io.File;

/**
 * 打印文件目录
 *
 * @author laok
 */
public class FileListAll {
    public static void main(String[] args) {
        String path = "D:\\学习视频\\300分钟搞定算法（带完整课件）";
        final File file = new File(path);
        fileListAllPrint(file, "—");
    }

    public static void fileListAllPrint(File file, String pref) {

        for (File listFile : file.listFiles()) {
            if (listFile.isDirectory()) {
                System.out.println("目录：" + pref + listFile.getName());
                fileListAllPrint(listFile, pref += pref);
            } else {
                System.out.println("文件：" + pref + listFile.getName());
            }
        }

    }
}
