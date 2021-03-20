package thread.threadPool;


import java.util.concurrent.*;


public class Main {
    public static void main(String[] args) {
        try {
           ScheduledExecutorService es = new ScheduledThreadPoolExecutor(2);
           // ExecutorService es = Executors.newFixedThreadPool(2);
            RunnableImpl runnable = new RunnableImpl();
            es.submit(runnable);
            es.submit(runnable);
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
