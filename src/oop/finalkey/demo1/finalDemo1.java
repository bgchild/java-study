package oop.finalkey.demo1;



/**
 * @author Ann00
 * @date 2020/8/21
 */
public class finalDemo1 {
    public static void main(String[] args) {
        // 创建 User 对象
        final User u = new User();
        // 创建 另一个 User对象
       // u = new User(); // 报错，指向了新的对象，地址值改变。
        // 调用setName方法
        u.setName("张三"); // 可以修改
    }
}
