package algorithm;

import java.util.*;

public class Test1 {
//1、数据里有{1,2,3,4,5,6,7,8,9}，请随机打乱顺序，生成一个新的数组（请以代码实现）

    public static void main(String[] args) {
        int[] ints = {1,2,3,4,5,6,7,8,9};
        int[] srand = srand(ints);
        System.out.println(Arrays.toString(srand));
    }

    public static int[] srand(int[] a){
        int[] b = new int[a.length];
        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
        while (hs.size() < 9){
            int tmp = (int)(Math.random() * (a.length));
            hs.add(tmp);
        }
        Iterator<Integer> iterator = hs.iterator();
        int s = 0;
        while (iterator.hasNext()){
            b[iterator.next()] = a[s++];
        }
        return b;
    }
}
