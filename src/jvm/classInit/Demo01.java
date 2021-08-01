package jvm.classInit;

/**
 * 执行顺序
 */
public class Demo01 {
    public static void main(String[] args) {
        B b = new B();
    }

}

class A {

    static String str1 = "父类A的静态变量";
    String str2 = "父类A的非静态变量";

    static {
        System.out.println("执行了父类A的静态代码块");
    }

    {
        System.out.println("执行了父类A的非静态代码块");
    }

    public A() {
        System.out.println("执行了父类A的构造方法");
    }
}

class B extends A {

    static String str1 = "子类B的静态变量";
    String str2 = "子类B的非静态变量";

    static {
        System.out.println("执行了子类B的静态代码块");
    }

    {
        System.out.println("执行了子类B的非静态代码块");
    }

    public B() {
        System.out.println("执行了子类B的构造方法");
    }
}
