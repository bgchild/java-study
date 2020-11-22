package api.scanner;

import java.util.Scanner;

/**
 * @author Ann00
 * @date 2020/8/21
 * 作为返回值
 */
public class demo4 {
    public static void main(String[] args) {
        // 普通方式
        Scanner sc = getScanner();
        System.out.println(sc);
    }

    public static Scanner getScanner() {
        //普通方式
        //Scanner sc = new Scanner(System.in);
        //return sc;
        //匿名对象作为方法返回值
        return new Scanner(System.in);
    }
}
