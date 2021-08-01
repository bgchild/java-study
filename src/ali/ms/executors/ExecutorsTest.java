package ali.ms.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 为什么阿里巴巴禁止Executors创建线程池
 * <p>
 * 模拟一下使用 Executors 导致 OOM 的情况
 * 通过指定 JVM 参数：-Xmx8m -Xms8m 运行以上代码，会抛出 OOM：
 *
 * @author laok
 */
public class ExecutorsTest {
    private static ExecutorService executor = Executors.newFixedThreadPool(15);

    public static void main(String[] args) {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            executor.execute(new SubThread());
        }
    }
}

class SubThread implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            //do nothing
        }
    }
}
