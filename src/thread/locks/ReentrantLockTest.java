package thread.locks;

import java.util.concurrent.locks.ReentrantLock;

/**
 * ReentrantLock
 * 可重入锁
 *
 * @author laok
 */
public class ReentrantLockTest {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            ReentrantLock rl = new ReentrantLock();

            @Override
            public void run() {
                rl.lock();
                try {
                    for (int i = 0; i < 100; i++) {
                        System.out.print(i);
                    }
                } finally {
                    rl.unlock();
                }
                System.out.println("========================");
            }
        };

        new Thread(runnable).start();
        new Thread(runnable).start();
    }
}
