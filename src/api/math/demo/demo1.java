package api.math.demo;


/**
 * @author Ann00
 * 请使用 Math 相关的API，计算在 -10.8 到 5.9 之间，绝对值大于 6 或者小于 2.1 的整数有多少个？
 */
public class demo1 {
    public static void main(String[] args) {
        int num = 0;
        double s = Math.ceil(-10.8);
        double e = Math.ceil(2.1);

        for (double i = s; i < e; i++) {
          if (Math.abs(i) > 6 || Math.abs(i) < 2.1){
              System.out.println(i);
              num++;
          }
        }
        System.out.println("符合区间的数共："+num);
    }
}

