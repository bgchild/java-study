package ali.ms.date;

import cn.hutool.core.collection.ConcurrentHashSet;
import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.*;

/**
 * 为什么阿里巴巴禁止把SimpleDateFormat定义成static
 * SimpleDateFormat非线程安全的
 * @author laok
 */
public class SimpleDateFormatTest {
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    final static CountDownLatch countDownLatch = new CountDownLatch(100);

    public static void main(String[] args) throws InterruptedException {
        //定义一个线程安全的HashSet
        final ConcurrentHashSet<String> hs = new ConcurrentHashSet<>();

        ThreadFactory threadFactory = new ThreadFactoryBuilder().setDaemon(true).setNameFormat("demo-pool-%d").build();
        final ThreadPoolExecutor executor = new ThreadPoolExecutor(4, 8, 0L, TimeUnit.SECONDS, new LinkedBlockingDeque<>(1024), threadFactory);

        for (int i = 0; i < 100; i++) {
            int finalI = i;
            final Runnable runnable = () -> {
                Calendar calendar = Calendar.getInstance();
                calendar.add(Calendar.DATE, finalI);
                final String format = simpleDateFormat.format(calendar.getTime());
                System.out.println(Thread.currentThread().getName()+":"+format);
                hs.add(format);
                countDownLatch.countDown();
            };
            executor.execute(runnable);
        }

        countDownLatch.await();
        System.out.println(hs.size());
    }
}
