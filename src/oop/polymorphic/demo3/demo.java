package oop.polymorphic.demo3;

/**
 * @author Ann00
 * @date 2020/8/21
 */
public class demo {
    public static void main(String[] args) {
        // 向上转型
        Animal animal = new Cat();
        animal.eat();
        // 向下转型
        Cat c = (Cat) animal;
        c.catchMouse();
        // 向下转型
        Dog d = (Dog) animal;
        d.watchHouse(); // 调用的是 Dog 的 watchHouse 【运行报错】
    }
}
