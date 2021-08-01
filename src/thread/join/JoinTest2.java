package thread.join;

/**
 * 控制线程执行顺序按T3、T2、T1执行
 * @author laok
 */
public class JoinTest2 {
    public static void main(String[] args) throws InterruptedException {
        final Thread T1 = new Thread(() -> {
            System.out.println("T1");
        });
        final Thread T2 = new Thread(() -> {
            System.out.println("T2");
        });
        final Thread T3 = new Thread(() -> {
            System.out.println("T3");
        });
        T3.start();
        T3.join();
        T2.start();
        T2.join();
        T1.start();
    }
}
