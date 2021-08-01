package file.digui;

/**
 * num的累和 = num + (num-1)的累和，所以可以把累和的操作定义成一个方法，递归调用
 *
 * @author laok
 */
public class Test02 {
    public static void main(String[] args) {
        final int sum = getNum(5);
        System.out.println(sum);
    }

    public static int getNum(int num) {
        if (num == 1) {
            return num;
        }
        return num + getNum(num - 1);
    }
}
