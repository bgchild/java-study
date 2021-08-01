package api.TimeTask;

import java.util.TimerTask;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 定时器
 */
public class TimeTaskTest {
    public static void main(String[] args) {
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("1");
            }
        };
        final ScheduledFuture<?> scheduledFuture = new ScheduledThreadPoolExecutor(1)
                .scheduleAtFixedRate(timerTask, 1, 1, TimeUnit.SECONDS);
    }
}
