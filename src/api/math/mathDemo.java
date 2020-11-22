package api.math;

/**
 * @author Ann00
 * @date 2020/8/21
 * public static double (double a) ：返回 double 值的绝对值。
 * public static double ceil(double a) ：返回大于等于参数的最小的整数。
 * public static double floor(double a) ：返回小于等于参数最大的整数。
 * public static long round(double a) ：返回最接近参数的 long。(相当于四舍五入方法)
 */
public class mathDemo {
    public static void main(String[] args) {
        System.out.println(Math.abs(-5));
        System.out.println(Math.ceil(-5.1));
        System.out.println(Math.floor(-5.1));
        System.out.println(Math.round(4.5));
    }
}
