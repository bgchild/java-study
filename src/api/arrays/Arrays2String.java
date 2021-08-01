package api.arrays;

import java.util.Arrays;

/**
 * @author Ann00
 * @date 2020/8/21
 * public static String toString(int[] a) ：返回指定数组内容的字符串表示形式。
 */
public class Arrays2String {
    public static void main(String[] args) {
        int[] ins = {1,2,3};
        String s = Arrays.toString(ins);
        System.out.println(s);
    }
}
