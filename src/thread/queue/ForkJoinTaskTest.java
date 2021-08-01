package thread.queue;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

/**
 * 二分
 * Fork/Join
 *
 * @author laok
 */
public class ForkJoinTaskTest extends RecursiveTask<Integer> {
    private int nThreads = 2;
    private int start;
    private int end;

    public ForkJoinTaskTest(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        int res = 0;
        if (end - start < nThreads) {
            for (int i = start; i <= end; i++) {
                res += i;
            }
        } else {
            //拆分
            int middle = start + (end - start) / 2;
            final ForkJoinTaskTest leftTask = new ForkJoinTaskTest(start, middle);
            final ForkJoinTaskTest rightTask = new ForkJoinTaskTest(middle + 1, end);
            leftTask.fork();
            rightTask.fork();
            res = leftTask.join() + rightTask.join();
        }
        return res;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        final ForkJoinTaskTest forkJoinTaskTest = new ForkJoinTaskTest(1, 6);
        final ForkJoinPool forkJoinPool = new ForkJoinPool();
        final ForkJoinTask<Integer> submit = forkJoinPool.submit(forkJoinTaskTest);
        System.out.println(submit.get());
    }
}
