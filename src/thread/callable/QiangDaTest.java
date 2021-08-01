package thread.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 抢答
 *
 * @author laok
 */
public class QiangDaTest {
    public static void main(String[] args) {
        final QiangDaCallable callable = new QiangDaCallable();
        final ExecutorService es = Executors.newFixedThreadPool(3);
        Future<Boolean> submit = es.submit(callable);
    }
}

class QiangDaCallable implements Callable<Boolean> {
    boolean flag = false;

    @Override
    public Boolean call() throws Exception {
        if (!flag) {
            System.out.println("抢答成功：" + Thread.currentThread().getName());
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }
}
