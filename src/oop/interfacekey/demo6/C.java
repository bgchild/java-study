package oop.interfacekey.demo6;

/**
 * @author Ann00
 * @date 2020/8/21
 * 接口的多继承
 * 个接口能继承另一个或者多个接口，这和类之间的继承比较相似。接口的继承使用 extends 关键字，子接口继承父接口的方法。如果父接口中的默认方法有重名的，那么子接口需要重写一次
 */
interface C extends A,B{
    @Override
    default void method() {
        System.out.println("DDDDDDDDDDDDDD");
    }
}
