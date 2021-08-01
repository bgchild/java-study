package api.math;

import java.math.BigInteger;

/**
 * @author Ann00
 * @date 2020/8/21
 * public static double (double a) ：返回 double 值的绝对值。
 * public static double ceil(double a) ：返回大于等于参数的最小的整数。
 * public static double floor(double a) ：返回小于等于参数最大的整数。
 * public static long round(double a) ：返回最接近参数的 long。(相当于四舍五入方法)
 */
public class MathTest {
    public static void main(String[] args) {
        System.out.println(Math.abs(-5));
        System.out.println(Math.ceil(-5.1));
        System.out.println(Math.floor(-5.1));
        System.out.println(Math.round(4.5));

        final int i = 1000000;
        Double a = Math.random() * i;
        final int r = a.intValue();
        System.out.println(r);

        int s1 = 111;
        int s2 = 222;
        final int s12 = Math.addExact(s1, s2);
        System.out.println(s12);

        final BigInteger bigA = new BigInteger("1111111111122222222222222222222");
        final BigInteger bigB = new BigInteger("1111111111122222222222222222222");
        final BigInteger add = bigA.add(bigB);
        System.out.println(add);
    }
}
