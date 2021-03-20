package algorithm;

import java.lang.reflect.Array;

public class Test5 {
    /**
     * 二分查找
     * 又叫折半查找，要求待查找的序列有序。每次取中间位置的值与待查关键字比较，如果中间位置的值比待查关键字大，则在前半部分循环这个查找的过程，如果中间位置的值比
     * 待查关键字小，则在后半部分循环这个查找的过程。直到查找到了为止，否则序列中没有待查的关键字。
     */
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8,9};
        System.out.println(biSearch(array, 4));
    }

    public static int biSearch(int[] array, int a) {
        int s = 0;
        int e = array.length - 1;
        int mid;
        System.out.println(s + "--" + e + "--");
        while (s <= e) {
            mid = (s + e) / 2;
            if (array[mid] == a) {
                return mid + 1;
            } else if (array[mid] < a) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
            System.out.println(s + "--" + e + "--" + mid);
        }

        return -1;
    }

}
