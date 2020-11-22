package thread.threadPool;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        try {
            ExecutorService es = Executors.newFixedThreadPool(2);
            RunnableImpl runnable = new RunnableImpl();
            es.submit(runnable);
            es.submit(runnable);
        }catch (Exception e){
            e.printStackTrace();
        }

    }


}
