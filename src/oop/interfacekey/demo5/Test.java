package oop.interfacekey.demo5;



/**
 * @author Ann00
 * @date 2020/8/21
 * 优先级的问题
 * 当一个类，既继承一个父类，又实现若干个接口时，父类中的成员方法与接口中的默认方法重名，子类就近选择执
 * 行父类的成员方法
 */
public class Test extends D implements A{
    public static void main(String[] args) {
        Test c = new Test();
        c.methodA();
    }
}
