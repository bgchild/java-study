package oop.statics;

public class B extends A {
    static {
        System.out.print("a");
    }

    public B() {
        System.out.print("b");
    }
}
