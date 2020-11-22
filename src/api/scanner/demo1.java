package api.scanner;

import java.util.Scanner;

/**
 * @author Ann00
 * 查看类
 * java.util.Scanner ：该类需要import导入后使用。
 * 查看构造方法
 * public Scanner(InputStream source) : 构造一个新的 Scanner ，它生成的值是从指定的输入流扫描的。
 * 查看成员方法
 * public int nextInt() ：将输入信息的下一个标记扫描为一个 int 值。
 */
public class demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("输入数字为" + a);
        int b = scanner.nextInt();
        System.out.println("输入数字为" + b);
        System.out.println("a + b =" + (a + b));
    }
}
