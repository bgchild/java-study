package thread.startAndRun;

/**
 * start和run的区别
 * run只是Thread里面的一个普通方法，start是启动线程的方法
 *
 * @author Ann00
 * @date 2020/8/17
 */
public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("创建了一个线程" + Thread.currentThread().getName());
            }
        };
        thread.run();
        thread.start();
    }
}
