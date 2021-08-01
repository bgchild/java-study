package jvm.classInit;

/**
 * 1、通过子类引用父类的静态字段，只会触发父类的初始化，而不会触发子类的初始化。
 */
class Parent {
    static int a = 100;

    static {
        System.out.println("parent init！");
    }
}

class Child extends Parent {
    static int c = 10;

    static {
        System.out.println("child init！");
    }
}

public class Init1 {
    public static void main(String[] args) {
        System.out.println(Child.a);
        // System.out.println(Child.c);
    }
}
