package ali.generics.demo6;

import java.util.ArrayList;
import java.util.List;

class Food {
}

class Fruit extends Food {
}

class Apple extends Fruit {
}

class Banana extends Fruit {
}

/**
 * 上下界限定符 extends 和 super
 *
 * @author laok
 * @date 2021/7/30
 */
public class Client {
    public static void extendsTest(List<? extends Fruit> list) {
        //因为 Fruit 的子类不只有 Apple 还有 Banana,这里不能确定具体的泛型到底是 Apple 还是 Banana，所以放入任何一种类型都会报错
        //list.add(new Apple());
        //可以正常获取
        Fruit fruit = list.get(1);
    }

    public static void superTest(List<? super Fruit> list) {
        //list.add(new Apple());
        //super 为下界通配符，可以存放元素，但是也只能存放当前类或者子类的实例，以当前的例子来讲，
        //无法确定 Fruit 的父类是否只有 Food 一个(Object 是超级父类)
        //list.add(new Food());
        Object object = list.get(0);
        System.out.println(object);
    }

    public static void main(String[] args) {
        List<Food> list = new ArrayList<>();
        list.add(new Food());
        list.add(new Banana());
        superTest(list);
    }
}
