package thread.waitAndNotify.demo;

/**
 * @author Ann00
 * @date 2020/8/19
 * 吃货线程
 */
public class ChiHuo extends Thread {
    private BaoZi bz;

    public ChiHuo(String name, BaoZi bz) {
        super(name);
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (bz) {
                if (bz.flag) {
                    try {
                        Thread.sleep(5000);
                        System.out.println(Thread.currentThread().getName() + "正在吃:" + bz.pier + "、" + bz.xianer + "的包子");
                        bz.flag = false;
                        bz.notify();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    //没包子
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
