package ali.ssugar.demo9;

/**
 * 数值字面量
 *
 * @author laok
 * @date 2021/7/31
 */
public class NumberTest {
    public static void main(String[] args) {
        //编译后 int i = 10000;
        int i = 10_000;
        System.out.println(i);
    }
}
