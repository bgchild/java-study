package thread.startAndRun;

/**
 * start和run的区别
 * run只是Thread里面的一个普通方法，start是启动线程的方法
 * 调用start方法方可启动线程，而run方法只是thread的一个普通方法调用，还是在主线程里执行
 */
public class StartAndRun {
    public static void main(String[] args) {
        final Thread thread = new Thread(() -> {
            System.out.println("创建了一个线程" + Thread.currentThread().getName());
        });
        thread.run();
        thread.start();
    }
}
