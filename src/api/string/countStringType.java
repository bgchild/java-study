package api.string;

import java.util.Scanner;

/**
 * @author Ann
 * 统计字符个数
 */
public class countStringType {
    //键盘录入一个字符，统计字符串中大小写字母及数字字符个数
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String in = scanner.next();
        int dxzm = 0;
        int xxzm = 0;
        int sz = 0;
        int qt = 0;
        char[] carr = in.toCharArray();
        for (char ch : carr) {
            if ('A' <= ch && ch < 'Z') {
                dxzm++;
            } else if ('a' <= ch && ch <= 'z') {
                xxzm++;
            } else if ('0' <= ch && ch <= '9') {
                sz++;
            } else {
                qt++;
            }
        }
        System.out.println("输入大写字母：" + dxzm);
        System.out.println("输入小写字母：" + xxzm);
        System.out.println("输入数字：" + sz);
        System.out.println("输入其他字母：" + qt);
    }
}
