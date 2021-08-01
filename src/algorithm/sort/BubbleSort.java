package algorithm.sort;

import java.util.Arrays;

/**
 * 冒泡
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 1, 3, 0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}
