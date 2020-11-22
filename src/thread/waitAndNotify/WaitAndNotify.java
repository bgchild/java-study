package thread.waitAndNotify;

/*
    进入到TimeWaiting(计时等待)有两种方式
    1.使用sleep(long m)方法,在毫秒值结束之后,线程睡醒进入到Runnable/Blocked状态
    2.使用wait(long m)方法,wait方法如果在毫秒值结束之后,还没有被notify唤醒,就会自动醒来,线程睡醒进入到Runnable/Blocked状态

    唤醒的方法:
         void notify() 唤醒在此对象监视器上等待的单个线程。
         void notifyAll() 唤醒在此对象监视器上等待的所有线程。
 */
public class WaitAndNotify {
    public static void main(String[] args) {
        //创建锁保证唯一
        Object object = new Object();
        //创建一个顾客线程(消费者)
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    synchronized (object) {
                        System.out.println("顾客1告诉店家要买什么皮什么馅的包子");
                        try {
                            object.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("顾客1买到包子开吃！");
                        System.out.println("---------------------------------------");
                    }
                }

            }
        }.start();
        //创建一个顾客2线程(消费者)
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    synchronized (object) {
                        System.out.println("顾客2告诉店家要买什么皮什么馅的包子");
                        try {
                            object.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("顾客2买到包子开吃！");
                        System.out.println("---------------------------------------");
                    }
                }

            }
        }.start();
        //创建一个老板线程(生产者)
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (object) {
                        System.out.println("老板5秒钟之后做好包子,告知顾客,可以吃包子了");
                        //object.notify();//唤醒线程
                        object.notifyAll();//唤醒所有线程

                    }
                }
            }
        }.start();
    }
}
