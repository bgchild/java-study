package api.random.guessnum;

import java.util.Random;
import java.util.Scanner;

/**
 * GuessNum
 *
 * @author Ann00
 */
public class GuessNum {
    public static void main(String[] args) {
        Random sz = new Random();
        int jg = sz.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("请输入您要猜的数字！");
            int sr = sc.nextInt();
            if (sr > jg) {
                System.out.println("输入的值太大了！");
            } else if (sr < jg) {
                System.out.println("输入的值太小了！");
            } else {
                System.out.println("恭喜你猜对了！");
                break;
            }
            if (i == 9) {
                System.out.println("游戏失败！");
            } else {
                System.out.println("还剩" + (9 - i) + "机会！");
            }
        }
    }
}
