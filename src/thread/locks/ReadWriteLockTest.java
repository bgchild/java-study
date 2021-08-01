package thread.locks;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 读写锁
 * @author laok
 */
public class ReadWriteLockTest {
    private ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
    private ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
    private ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();

    public void read() {
        try {
            readLock.lock();
            System.out.println(Thread.currentThread().getName() + " 获取读锁");
            Thread.sleep(2 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(Thread.currentThread().getName() + " 释放读锁");
            readLock.unlock();
        }
    }
    //写锁阻塞
    public void write() {
        try {
            writeLock.lock();
            System.out.println(Thread.currentThread().getName() + " 获取写锁");
            Thread.sleep(2 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(Thread.currentThread().getName() + " 释放写锁");
            writeLock.unlock();
        }
    }

    public static void main(String[] args) {
        ReadWriteLockTest readWriteLockTest = new ReadWriteLockTest();
        Thread t1 = new Thread(readWriteLockTest::read);
        Thread t2 = new Thread(readWriteLockTest::read);
        Thread t3 = new Thread(readWriteLockTest::read);
        Thread t11 = new Thread(readWriteLockTest::write);
        Thread t21 = new Thread(readWriteLockTest::write);
        Thread t31 = new Thread(readWriteLockTest::write);
        t1.start();
        t2.start();
        t3.start();
        t11.start();
        t21.start();
        t31.start();
    }
}
