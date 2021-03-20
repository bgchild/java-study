package designPattern.singleton;

public class runTest {
    public static void main(String[] args) {
//        //懒汉式 （消耗内存）
//        System.out.println(Singleton.getInstance());
//        System.out.println(Singleton.getInstance());
//        //饿汉式 (线程不安全，不可用)
//        System.out.println(Singleton2.getInstance());
//        System.out.println(Singleton2.getInstance());
        //多线程执行
//        for (int i = 0; i < 10; i++) {
//            new Thread(() -> Singleton2.getInstance()).start();
//        }


        for (int i = 0; i < 5; i++) {
            new Thread(() -> Singleton6.INSTANCE.doSomething()).start();
        }
    }
}
