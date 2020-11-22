package api.arrayList.demo;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Ann00
 * @date 2020/8/21
 * 获取集合方法
 */
public class demo4 {
    public static void main(String[] args) {
        // 创建Random 对象
        Random random = new Random();
        // 创建ArrayList 对象
        ArrayList<Integer> list = new ArrayList<>();
        // 添加随机数到集合
        for (int i = 0; i < 20; i++) {
            int r = random.nextInt(1000) + 1;
            list.add(r);
        }
        // 调用偶数集合的方法
        ArrayList<Integer> arrayList = getArrayList(list);
        System.out.println(arrayList);
        }

        public static ArrayList<Integer> getArrayList(ArrayList<Integer> list) {
        // 创建小集合,来保存偶数
        ArrayList<Integer> smallList = new ArrayList<>();
        // 遍历list
            for (Integer num : list) {
                // 获取元素
                // 判断为偶数,添加到小集合中
                if (num % 2 == 0) {
                    smallList.add(num);
                }
            }
        // 返回小集合
        return smallList;
}

}
