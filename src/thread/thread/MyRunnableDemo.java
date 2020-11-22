package thread.thread;

/**
 * @author Ann00
 * @date 2020/8/19
 */
public class MyRunnableDemo {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread thread = new Thread(mr, "阿强");
        thread.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("阿珍"+i);
        }

    }
}
