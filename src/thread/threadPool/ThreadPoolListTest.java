package thread.threadPool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Consumer;

public class ThreadPoolListTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Future<Integer>> futures = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            ExecutorService executorService = Executors.newFixedThreadPool(9);
            Future<Integer> submit = executorService.submit(new ThreadPoolListCallable(i));
            //futures.add(submit);
            list.add(submit.get());
            //System.out.println();
        }

        for (Integer integer : list) {
            System.out.println(integer);
        }
//        futures.forEach(new Consumer<Future<Integer>>() {
//            @Override
//            public void accept(Future<Integer> integerFuture) {
//                try {
//                    System.out.println(integerFuture.get());
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                } catch (ExecutionException e) {
//                    e.printStackTrace();
//                }
//            }
//        });


    }
}
