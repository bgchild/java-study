package thread.waitAndNotify.demo;

/**
 * @author Ann00
 * @date 2020/8/19
 */
/**
 * 包子铺线程生产包子，吃货线程消费包子。
 * 当包子没有时（包子状态为false），吃货线程等待，包子铺线程生产包子（即包子状态为true），并通知吃货线程（解除吃货的等待状态）,因为已经有包子了，那么包子铺线程进入等待状态。
 * 接下来，吃货线程能否进一步执行则取决于锁的获取情况。如果吃货获取到锁，那么就执行吃包子动作，包子吃完（包子状态为false），并通知包子铺线程（解除包子铺的等待状态）,
 * 吃货线程进入等待。包子铺线程能否进一步执行则取决于锁的获取情况。
 */

public class demo {
    public static void main(String[] args) {
        //等待唤醒案例
        BaoZi bz = new BaoZi();
        ChiHuo ch = new ChiHuo("吃货",bz);
        BaoZiPu bzp = new BaoZiPu("包子铺",bz);
        ch.start();
        bzp.start();

    }
}
