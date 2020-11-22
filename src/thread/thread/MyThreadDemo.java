package thread.thread;

/**
 * @author Ann
 */
public class MyThreadDemo {

    public static final int INT = 20;

    public static void main(String[] args) {
        Thread thread = new MyThread();
        thread.start();
        for (int i = 0; i < INT; i++) {
            System.out.println("MAIN" + i);
        }
    }
}
