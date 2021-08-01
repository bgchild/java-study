package jvm.classInit;

/**
 * 常量在编译期间会存入调用类的常量池中，本质上并没有直接引用定义常量的类
 * 不会触发定义常量所在的类。
 */
class Const {
    static final int A = 100;

    static {
        System.out.println("Const init");
    }
}

public class Init3 {
    public static void main(String[] args) {
        System.out.println(Const.A);
    }
}
