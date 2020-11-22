package api.arrayList.demo;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Ann00
 * @date 2020/8/21
 * 生成6个1~33之间的随机整数,添加到集合,并遍历
 */
public class demo1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            arr.add(random.nextInt(33) + 1);
        }

        for (Integer item : arr) {
            System.out.println(item);
        }

    }
}
