package oop.polymorphic.demo;

/**
 * @author Ann00
 * @date 2020/8/21
 */
public class Demo {
    public static void main(String[] args) {
        // 创建笔记本实体对象
        Laptop laptop = new Laptop();
        // 笔记本开启
        laptop.run();
        // 创建鼠标实体对象
        Usb usb = new Mouse();
        // 笔记本使用鼠标
        laptop.useUsb(usb);
        // 创建键盘实体对象
        Usb usb2 = new KeyBoard();
        // 笔记本使用键盘
        laptop.useUsb(usb2);
        // 笔记本关闭
        laptop.shutDow();
    }
}
