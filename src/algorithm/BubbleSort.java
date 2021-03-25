package algorithm;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class BubbleSort {
    private static void bubbleSort(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 1; j < len; j++) {
                if (nums[j - 1] > nums[j]) {
                    swap(nums, j - 1, j);
                }
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int tmp = nums[j];
        nums[j] = nums[i];
        nums[i] = tmp;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 7, 9, 5, 8};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
