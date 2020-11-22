package oop.polymorphic.demo;

/**
 * @author Ann00
 * @date 2020/8/21
 */
public class Mouse implements Usb{
    @Override
    public void open() {
        System.out.println("鼠标插入！");
    }

    @Override
    public void close() {
        System.out.println("鼠标拔开！");
    }

    public void click(){
        System.out.println("鼠标点击！");
    }
}
