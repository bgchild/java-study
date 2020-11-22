package thread.thread;

/**
 * @author Ann
 */
public class MyThread extends Thread {

    public static final int INT = 20;

    @Override
    public void run() {
        for (int i = 0; i < INT; i++) {
            System.out.println("MyThread" + i);
        }
    }
}
