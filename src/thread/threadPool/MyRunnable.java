package thread.threadPool;

/**
 * @author Ann00
 * @date 2020/8/19
 */
public class MyRunnable implements Runnable {
    private int name;

    public MyRunnable(int name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("我要一个教练" + name);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("教练来了： " + Thread.currentThread().getName());
        System.out.println("教我游泳,交完后，教练回到了游泳池");
    }
}
