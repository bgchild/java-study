package file.digui;

/**
 * @author Ann00
 * @date 2020/8/19
 */

/**
 * num的累和 = num + (num-1)的累和，所以可以把累和的操作定义成一个方法，递归调用
 */
public class Demo02 {
    public static void main(String[] args) {
       int num = 5;
        System.out.println(getNum(num));
    }

    public static int getNum(int num){
        if (num == 1){
            return num;
        }
        return num + getNum(num - 1);
    }
}
