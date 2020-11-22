package api.scanner;

import java.util.Scanner;

/**
 * @author Ann00
 * @date 2020/8/21
 * 匿名对象可以作为方法的参数和返回值
 */
public class demo3 {
    public static void main(String[] args) {
        // 普通方式
        Scanner sc = new Scanner(System.in);
        input(sc);

        //匿名对象作为方法接收的参数
        input(new Scanner(System.in));
    }

    public static void input(Scanner sc) {
        System.out.println(sc);
    }
}
