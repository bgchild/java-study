package oop.polymorphic.demo3;

/**
 * @author Ann00
 * @date 2020/8/21
 */
public class Cat extends Animal{
    @Override
    void eat() {
        System.out.println("猫吃鱼！");
    }

    public void catchMouse() {
        System.out.println("抓老鼠");
    }

}
