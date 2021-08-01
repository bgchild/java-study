package thread.locks;

/**
 * 死锁
 *
 * @author laok
 */
public class DeadLock {
    static class Az {
        public synchronized void say(Aq aq) {
            System.out.println("我是阿珍！");
            aq.get();
        }

        public synchronized void get() {
            System.out.println("阿珍爱上了阿强！");
        }
    }

    static class Aq {
        public synchronized void say(Az az) {
            System.out.println("我是阿强！");
            az.get();
        }

        public synchronized void get() {
            System.out.println("阿强爱上了阿珍！");
        }
    }

    static class DeadLockRunnable implements Runnable {
        private Az az;
        private Aq aq;

        public DeadLockRunnable(Az az, Aq aq) {
            this.az = az;
            this.aq = aq;
        }

        @Override
        public void run() {
            az.say(aq);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Az az = new Az();
        Aq aq = new Aq();
        DeadLockRunnable runnable = new DeadLockRunnable(az, aq);
        new Thread(runnable).start();
        Thread.sleep(1000);
        aq.say(az);
    }


}
