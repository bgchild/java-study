package oop.statics.demo;

import java.util.ArrayList;

/**
 * @author Ann00
 * @date 2020/8/21
 */
public class GameDemo {
    public static void main(String[] args) {
        ArrayList<String> list = Game.getList();
        System.out.println(Game.number);
        for (String s : list) {
            System.out.println(s);
        }
    }
}
