package oop.polymorphic.demo3;

/**
 * @author Ann00
 * @date 2020/8/21
 * 向下转型
 */
public class demo1 {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.catchMouse();
        } else if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }
    }
}
