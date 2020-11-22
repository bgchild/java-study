package api.scanner;

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("第一次输入的值：" + a);
        int b = sc.nextInt();
        System.out.println("第一次输入的值：" + b);
        int c = sc.nextInt();
        System.out.println("第一次输入的值：" + c);
        int tmp = a > b ? a : b;
        int jg = tmp > c ? tmp : c;
        System.out.println("最大值：" + jg);
    }
}
