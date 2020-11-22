package api.random;

import java.util.Random;

/**
 * @author Ann00
 * @date 2020/8/21
 * 查看类
 * java.util.Random ：该类需要 import导入使后使用。
 * 查看构造方法
 * public Random() ：创建一个新的随机数生成器。
 * 查看成员方法
 * public int nextInt(int n) ：返回一个伪随机数，范围在 0 （包括）和 指定值 n （不包括）之间的
 * int 值
 */
public class demo1 {
    public static void main(String[] args) {
        //2. 创建键盘录入数据的对象
        Random r = new Random();
        for (int i = 0; i < 3; i++) {
        //3. 随机生成一个数据
        int number = r.nextInt(10);
        //4. 输出数据
        System.out.println("number:" + number);
        }
    }
}
