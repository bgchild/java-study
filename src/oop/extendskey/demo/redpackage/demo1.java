package oop.extendskey.demo.redpackage;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Ann00
 * @date 2020/8/21
 */
public class demo1 {
    public static void main(String[] args) {
        // 创建一个群主对象
        QunZhu qz = new QunZhu("群主", (double) 200);
        // 创建一个键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入金额:");
        int money = sc.nextInt();
        System.out.println("请输入个数:");
        int count = sc.nextInt();
        // 发送红包
        ArrayList<Double> sendList = qz.sendRedPackage(money, count);

        // 判断,如果余额不足
        if (sendList == null) {
            System.out.println(" 余额不足...");
            return;
        }
        // 创建三个成员
        ChengYuan m = new ChengYuan("m1", (double) 0);
        ChengYuan m2 = new ChengYuan("m2", (double) 0);
        ChengYuan m3 = new ChengYuan("m3", (double) 0);
        // 打开红包
        m.openRedPackage(sendList);
        m2.openRedPackage(sendList);
        m3.openRedPackage(sendList);
        // 展示信息
        qz.show();
        m.show();
        m2.show();
        m3.show();
    }
}
