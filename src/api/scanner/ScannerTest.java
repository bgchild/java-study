package api.scanner;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        System.out.println("输入两个数字求和");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("输入数字为" + a);
        int b = scanner.nextInt();
        System.out.println("输入数字为" + b);
        System.out.println("a + b =" + (a + b));

        System.out.println("最大值");

    }
}
