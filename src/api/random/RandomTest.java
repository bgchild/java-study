package api.random;

import java.util.Random;

/**
 * 生成0-5的随机数
 */
public class RandomTest {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            final int n = new Random().nextInt(6);
            System.out.println(n);
        }
    }
}
