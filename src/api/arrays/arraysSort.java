package api.arrays;

import java.util.Arrays;

/**
 * @author Ann00
 * @date 2020/8/21
 * public static void sort(int[] a) ：对指定的 int 型数组按数字升序进行排序。
 */
public class arraysSort {
    public static void main(String[] args) {
        // 定义int 数组
        int[] arr = {24, 7, 5, 48, 4, 46, 35, 11, 6, 2};
        System.out.println("排序前:"+ Arrays.toString(arr)); // 排序前:[24, 7, 5, 48, 4, 46, 35, 11, 6,2]
        // 升序排序
        Arrays.sort(arr);
        System.out.println("排序后:"+ Arrays.toString(arr));// 排序后:[2, 4, 5, 6, 7, 11, 24, 35, 46, 48]
    }
}
