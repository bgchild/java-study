package oop.polymorphic.demo;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * @author Ann00
 * @date 2020/8/21
 */
public class Laptop {
    public void run() {
        System.out.println("笔记本运行...");
    }

    public void useUsb(Usb usb) {
        if (usb != null) {
            usb.open();
            if (usb instanceof Mouse){
                Mouse mouse = (Mouse) usb;
                mouse.click();
            }else if (usb instanceof KeyBoard){
                KeyBoard keyBoard = (KeyBoard) usb;
                keyBoard.work();
            }
            usb.open();
        }
    }

    public void shutDow() {
        System.out.println("笔记本关机...");
    }
}
