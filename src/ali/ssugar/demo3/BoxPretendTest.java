package ali.ssugar.demo3;

/**
 * 语法糖
 * 自动装拆箱
 *
 * @author laok
 * @date 2021/7/31
 */
public class BoxPretendTest {
    public static void main(String[] args) {
        int i = 10;
        Integer n = i;
    }
    //反编译后
    //    public static void main(String args[])
    //    {
    //        int i = 10;
    //        Integer n = Integer.valueOf(i);
    //    }
}
