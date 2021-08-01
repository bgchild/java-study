package thread.threadLocal;

/**
 * ThreadLocal
 * 创建线程局部变量
 */
public class ThreadLocalTest {
    public static void main(String[] args) {
        // 声明 ThreadLocal对象
        final ThreadLocal<Object> tl = new ThreadLocal<>();
        // 在主线程、子线程1、子线程2中去设置访问它的值
        tl.set(true);
        System.out.println("Main " + tl.get());

        //子线程1
        new Thread(() -> {
            tl.set(false);
            System.out.println(Thread.currentThread().getName() + tl.get());
        }, "Thread#1").start();
        //子线程2
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + tl.get());
        }, "Thread#2").start();
    }
}
