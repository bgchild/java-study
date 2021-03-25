package file.digui;

import java.io.File;

public class Demo10 {
    public static void main(String[] args) {
//        能够说出File对象的创建方式
//        能够说出File类获取名称的方法名称
//        能够说出File类获取绝对路径的方法名称
//        能够说出File类获取文件大小的方法名称
//        能够说出File类判断是否是文件的方法名称
//        能够说出File类判断是否是文件夹的方法名称
//        能够辨别相对路径和绝对路径
//        能够遍历文件夹
//        能够解释递归的含义
//        能够使用递归的方式计算5的阶乘
//        能够说出使用递归会内存溢出隐患的原因
        File file = new File("D:/a.txt");
        System.out.println("文件名称：" + file.getName());
        System.out.println("绝对路径：" + file.getAbsolutePath());
        System.out.println("相对路径：" + file.getPath());
        System.out.println("文件大小：" + file.length());
        System.out.println("是否是文件：" + file.isFile());
        System.out.println("是否是目录：" + file.isDirectory());
        //System.out.println(jc(5));
        File file1 = new File("D:/系统软件/soft");
        printDir(file1);
    }

    public static int jc(int n) {
        if (n == 1) return n;
        return jc(n - 1) * n;
    }

    public static void printDir(File file) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()) {
                System.out.println(file1.getName());
            } else {
                printDir(file1);
            }
        }
    }
}
