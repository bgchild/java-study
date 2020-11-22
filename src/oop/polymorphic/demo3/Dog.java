package oop.polymorphic.demo3;

/**
 * @author Ann00
 * @date 2020/8/21
 */
public class Dog extends Animal{
    @Override
    void eat() {
        System.out.println("狗吃肉！");
    }

    public void watchHouse() {
        System.out.println("看家");
    }
}
