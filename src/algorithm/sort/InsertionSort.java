package algorithm.sort;

import java.util.Arrays;

/**
 * 插入排序
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 1, 3, 0};
        InsertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //插入排序
    static void InsertionSort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            int e = arr[i];
            for (int j = i + 1; j > 0; j--) {
                if (e > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
    }

    //插入排序优化
    static void InsertionSort2(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            int e = arr[i];
            int j = i;
            for (; j > 0; j--) {
                if (e < arr[j - 1]) {
                    arr[j] = arr[j - 1];
                } else {
                    break;
                }
            }
            arr[j] = e;
        }
    }
}
