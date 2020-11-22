package oop.interfacekey.demo3;

/**
 * @author Ann00
 * @date 2020/8/21
 */
public interface LiveAble {
    default void fly() {
        System.out.println("起飞");
    }
}
