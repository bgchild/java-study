package oop.polymorphic.demo2;

/**
 * @author Ann00
 * @date 2020/8/21
 */
public class demo1 {
    public static void main(String[] args) {
        // 多态形式，创建对象
        Cat c = new Cat();
        Dog d = new Dog();
        // 调用showCatEat
        showCatEat(c);
        // 调用showDogEat
        showDogEat(d);
        /*
        以上两个方法, 均可以被showAnimalEat(Animal a)方法所替代
        而执行效果一致
        */
        showAnimalEat(c);
        showAnimalEat(d);

    }

    public static void showCatEat(Cat c) {
        c.eat();
    }

    public static void showDogEat(Dog d) {
        d.eat();
    }

    public static void showAnimalEat(Animal a) {
        a.eat();
    }
}
