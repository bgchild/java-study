package oop.interfacekey.demo2;

/**
 * @author Ann00
 * @date 2020/8/21
 */
public interface LiveAble {
    public default void fly(){
        System.out.println("起飞");
    }
}
