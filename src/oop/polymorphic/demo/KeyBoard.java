package oop.polymorphic.demo;

/**
 * @author Ann00
 * @date 2020/8/21
 */
public class KeyBoard implements Usb{
    @Override
    public void open() {
        System.out.println("键盘插入！");
    }

    @Override
    public void close() {
        System.out.println("键盘拔开！");
    }

    public void work(){
        System.out.println("键盘打字！");
    }
}
