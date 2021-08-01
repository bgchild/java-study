package algorithm.sort;

import java.util.Arrays;

/**
 * 1. 选择排序（Selection Sort）
 * https://github.com/frank-lam/fullstack-tutorial/blob/master/notes/%E6%95%B0%E6%8D%AE%E7%BB%93%E6%9E%84%E4%B8%8E%E7%AE%97%E6%B3%95.md
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 1, 3, 0};
        functionName(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void functionName(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int minI = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minI] > arr[j]) {
                    minI = j;
                }
            }
            swap(arr, i, minI);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
