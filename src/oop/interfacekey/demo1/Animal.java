package oop.interfacekey.demo1;

/**
 * @author Ann00
 * @date 2020/8/21
 */
public class Animal implements LiveAble{
    @Override
    public void eat() {
        System.out.println("吃");
    }

    @Override
    public void sleep() {
        System.out.println("睡");
    }
}
