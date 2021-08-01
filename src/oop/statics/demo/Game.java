package oop.statics.demo;

import java.util.ArrayList;

/**
 * @author Ann00
 * @date 2020/8/21
 */
public class Game {
    public static int number;
    public static ArrayList<String> list;

    static {
        // 给类变量赋值
        number = 2;
        list = new ArrayList<>();
        // 添加元素到集合中
        list.add("张三");
        list.add("李四");
        System.out.println(list);
    }

    public static ArrayList<String> getList() {
        return list;
    }

    public static void setList(ArrayList<String> list) {
        Game.list = list;
    }
}
