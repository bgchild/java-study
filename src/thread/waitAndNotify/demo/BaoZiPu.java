package thread.waitAndNotify.demo;

/**
 * @author Ann00
 * @date 2020/8/19
 * 包子铺线程
 */
public class BaoZiPu extends Thread {
    private BaoZi bz;

    public BaoZiPu(String name, BaoZi bz) {
        super(name);
        this.bz = bz;
    }

    @Override
    public void run() {
        int count = 0;
        while (true) {
            synchronized (bz) {
                //有包子等待
                if (bz.flag) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    Thread.sleep(5000);
                    //制作包子
                    System.out.println(Thread.currentThread().getName() + "包子铺开始生产包子");
                    if (count % 2 == 0) {
                        // 冰皮 五仁
                        bz.pier = "冰皮";
                        bz.xianer = "五仁";
                    } else {
                        // 薄皮 牛肉
                        bz.pier = "薄皮";
                        bz.xianer = "牛肉";
                    }
                    count++;
                    bz.flag=true;
                    System.out.println("包子造好了："+bz.pier+bz.xianer);
                    System.out.println("吃货来吃吧");
                    //唤醒等待线程 （吃货）
                    bz.notify();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
