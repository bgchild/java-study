package ali.ssugar.demo7;

/**
 * 条件编译
 *
 * @author laok
 * @date 2021/7/31
 */
public class ConditionalCompilation {
    public static void main(String[] args) {
        final boolean DEBUG = true;
        if (DEBUG) {
            System.out.println("Hello, DEBUG!");
        }
        final boolean ONLINE = false;
        if (ONLINE) {
            System.out.println("Hello, ONLINE!");
        }
    }
}
