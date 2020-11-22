package lambda.thread;

public class Main {
    public static void main(String[] args) {
        //使用匿名内部类方式实现
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("创建了一个线程：" + Thread.currentThread().getName());
            }
        }).start();

        //使用lambda表达式
        new Thread(() -> {
            System.out.println("创建了一个线程：" + Thread.currentThread().getName());
        }).start();
    }
}
