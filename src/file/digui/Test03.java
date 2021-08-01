package file.digui;

/**
 * @author Ann00
 * @date 2020/8/20
 * 递归阶层 n! = n * (n‐1) *...* 3 * 2 * 1
 */
public class Test03 {
    public static void main(String[] args) {
        final int jc = jc(5);
        System.out.println(jc);
    }

    public static int jc(int num) {
        if (num == 1) {
            return num;
        }
        return num * jc(num - 1);
    }
}
