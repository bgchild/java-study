package oop.interfacekey.demo3;

/**
 * @author Ann00
 * @date 2020/8/21
 */
public class Animal implements LiveAble {
    // 继承，什么都不用写，直接调用
    @Override
    public void fly() {
        System.out.println("飞起来了");
    }
}
