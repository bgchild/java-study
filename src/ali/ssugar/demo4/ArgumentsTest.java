package ali.ssugar.demo4;

/**
 * 方法的边长参数
 *
 * @author laok
 * @date 2021/7/31
 */
public class ArgumentsTest {
    public static void main(String[] args) {
        print("ym", "gz:ym", "blog：www.dmm.com");
    }

    public static void print(String... str) {
        for (String s : str) {
            System.out.println(s);
        }
    }
}
