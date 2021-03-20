package algorithm;

import java.util.Arrays;

public class Test6 {

    /*
     *  冒泡排序算法
     *  (1）比较前后相邻的二个数据，如果前面数据大于后面的数据，就将这二个数据交换。
     * （2）这样对数组的第 0 个数据到 N-1 个数据进行一次遍历后，最大的一个数据就“沉” 到数组第N-1 个位置。
     * （3） N=N-1，如果 N 不为 0 就重复前面二步，否则排序完成。
     *
     */
    public static void main(String[] args) {
        int[] arr = {1, 32, 31, 12};
        int i, j;
        int n = arr.length;
       // for (i = 0; i < n; i++) {
            for (j = 1; j < n - 0; j++) {
                if (arr[j] < arr[j - 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                }
            }
      //  }
        System.out.println(Arrays.toString(arr));
    }


}
