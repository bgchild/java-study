package math.demo1;
//请使用 Math 相关的API，计算在 -10.8 到 5.9 之间，绝对值大于 6 或者小于 2.1 的整数有多少个

/**
 * 分析
 * 1.向上取整Math.ceil 或者强转为int
 * 2、遍历判断绝对值在6或者2.1之间的整数 Math.abs();
 * 3、统计符合条件的个数
 * <p>
 * 今天一共学习了
 * Math
 * Arrays
 * static
 * String
 * ArrayList
 * Random
 * Scanner
 * 类型的强制转换
 * @author Ann00
 */
public class Main {
    public static void main(String[] args) {
        double min = Math.ceil(-10.8);
        System.out.println(min);
        double max = Math.ceil(5.9);
        System.out.println(max);
        int count = 0;
        for (double i = min; i < max; i++) {
            if (Math.abs(i) > 6 || Math.abs(i) < 2.1) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("符合条件的共计：" + count);
    }
}

